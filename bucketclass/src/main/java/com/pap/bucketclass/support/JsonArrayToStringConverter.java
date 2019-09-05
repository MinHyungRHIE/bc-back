package com.pap.bucketclass.support;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.AttributeConverter;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonArrayToStringConverter implements AttributeConverter<List<String>, String> {
	
	@Override
	public String convertToDatabaseColumn(List<String> attribute) {
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonInString = null;
		try {
			jsonInString = objectMapper.writeValueAsString(attribute);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return jsonInString;        
	}

	@Override
	public List<String> convertToEntityAttribute(String dbData) {
		List<String> objectArray = new ArrayList<>();
		ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectArray = objectMapper.readValue(dbData, List.class);
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
        return objectArray;
	}
	
}
