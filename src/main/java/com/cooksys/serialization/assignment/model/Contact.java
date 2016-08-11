package com.cooksys.serialization.assignment.model;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Contact {
	@XmlElement
    private String firstName;
	@XmlElement
    private String lastName;
	@XmlElement
    private String email;
	@XmlElement
    private String phoneNumber;
	@XmlTransient
    public String getFirstName() {
        return firstName;
    }
	
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
	@XmlTransient
    public String getLastName() {
        return lastName;
    }
	
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
	@XmlTransient
    public String getEmail() {
        return email;
    }
	
    public void setEmail(String email) {
        this.email = email;
    }
	@XmlTransient
    public String getPhoneNumber() {
        return phoneNumber;
    }
	
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
