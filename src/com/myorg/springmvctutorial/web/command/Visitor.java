package com.myorg.springmvctutorial.web.command;

public class Visitor {
	private String firstName = "";
	private String lastName = "";
	private String completeName = "";

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String aFirstName) {
		this.firstName = aFirstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String aLastName) {
		this.lastName = aLastName;
	}
	public String getCompleteName() {
		return completeName;
	}
	public void setCompleteName(String completeName) {
		this.completeName = completeName;
	}

}