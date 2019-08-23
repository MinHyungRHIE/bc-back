package com.pap.bucketclass.support;

import javax.persistence.AttributeConverter;

public class BooleanToIntegerConverter implements AttributeConverter<Boolean,Long>{

	@Override
	public Long convertToDatabaseColumn(Boolean attribute) {
		System.out.println(attribute);
		return (long) (attribute ? 1:0);
	}

	@Override
	public Boolean convertToEntityAttribute(Long dbData) {
		System.out.println(dbData);
		return 0 != dbData;
	}
	
}
