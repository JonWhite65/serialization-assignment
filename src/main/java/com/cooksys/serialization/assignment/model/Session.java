package com.cooksys.serialization.assignment.model;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
public class Session {
	@XmlElement
    private String location;
	@XmlElement
    private String startDate;
	@XmlElement
    private Instructor instructor;
	@XmlElement
    private List<Student> students;
	@XmlTransient
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    @XmlTransient
    public String getStartDate() {
        return startDate;
    }
   
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    @XmlTransient
    public Instructor getInstructor() {
        return instructor;
    }
    
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    @XmlTransient
    public List<Student> getStudents() {
        return students;
    }
    
    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
