package csce247.assignments.singelton;

import java.util.ArrayList;

public class HospitalSystem extends Patient{
private ArrayList<Patient> patients = new ArrayList<Patient>();
private static HospitalSystem hospitalSystem;

private HospitalSystem()
{	
}
/*
 * creates hospital system
 */
public HospitalSystem getInstance()
{
	if (hospitalSystem == null) {
		System.out.println("Creating a Hospital System");
		hospitalSystem = new HospitalSystem();
	}
	return hospitalSystem;
	/*
	 * adds patient
	 */
}
public int addPatient(String firstName, String LastName)
{
	patients.add(firstName);
	return id;
}
/*
 * gets record
 */
public String getRecord(int id)
{
	System.out.println(id);
	return firstName + lastName;
	
}
/*
 * makes current allergy
 */
public void addAllergy(int id, String allergy)
{
	Patient.allergy = this.addAllergy(allergy);;
}
/*
 * shows strings
 */
public String getAllPatientsData()
{
	System.out.println("*** Welcome to our patient allergy tracking system ***\n");
	System.out.println("Displaying Patient: \n");
	System.out.println("Patient 1: " + firstName + lastName + "\n");
	return firstName + lastName + id;
}
}
