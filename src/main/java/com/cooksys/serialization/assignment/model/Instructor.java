package com.cooksys.serialization.assignment.model;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement

public class Instructor {
	@XmlElement
    private Contact contact;
	@XmlTransient
    public Contact getContact() {
        return contact;
    }
	
    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
