package com.ecommerce;

import java.util.Date;

public class Doctor {

	// attributes (non local scoped variables)
	public int id;
	public String name;
	protected float age;

	public char gender;
	String designation;
	boolean isOnDuty;

	final private Date dateOfBirth = null;

	static int noOfWorkingDays = 250;

	double chargePerVisit = 100;

	{
		int s = 100;
	}

	public Doctor() {

	}

	public Doctor(String name) {
		this.name = name;
	}

	public Doctor(String name, float age) {
		this.name = name;
		this.age = age;
	}
	
	public Doctor(int id, String name, float age) {
		this.id=id;
		this.name = name;
		this.age = age;
	}

	// operations or methods

	/*
	 * This is a multi-line comment that can be used to provide detailed
	 * explanations for a block of code
	 */
	public void examinePatient(Patient pat) throws DoctorNotAvailableException{
		if (this.isOnDuty == false)
			throw new DoctorNotAvailableException("Doctor on Leave");

		int x = 10; // local scoped varibles
		System.out.println("Inside examinePatient method.");
		System.out.println("Examining " + pat.name);
		System.out.println(x);
	}

	void prescribeMedicine() {
		System.out.println("Inside prescribeMedicine method.");
		// System.out.println(s);
	}

	public double calculateBill(int noOfVisits) {
		return chargePerVisit * noOfVisits;
	}

	public double calculateBill(String patientType, int noOfVisits) {
		return chargePerVisit * noOfVisits;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float f) {
		this.age = age;
	}

	void promoteToNextGrade() {
		// ... access date of birth attribute and then calculate the promotion grade
	}

}
