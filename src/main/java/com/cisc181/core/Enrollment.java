package com.cisc181.core;

import java.util.UUID;
import java.util.Date;

public class Enrollment {

	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment() 
	{
	}
	
	public Enrollment(UUID studentID, UUID sectionID) {
		this.StudentID = studentID;
		this.SectionID = sectionID;
		this.EnrollmentID = new UUID(1, 1);
		
	}

	public void setGrade(double grade) {
		Grade = grade;
	}
	
	
	
}
