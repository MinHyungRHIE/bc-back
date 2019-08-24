package com.pap.bucketclass.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class TestCommand {
	
	private String name;
	private String email;
	
//	private List<TestSubCommand> testObject = new ArrayList<>();
	
	public String getName() {
		return name;
	}
	public TestCommand setName(String name) {
		this.name = name;
		return this;
	}
	public String getEmail() {
		return email;
	}
	public TestCommand setEmail(String email) {
		this.email = email;
		return this;
	}
	
//	public List<TestSubCommand> getTestObject() {
//		return testObject;
//	}
//	
//	public void setTestObject(List<TestSubCommand> testObject) {
//		this.testObject = testObject;
//	}

	
}
