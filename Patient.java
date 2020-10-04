package csce247.assignments.singelton;

import java.util.ArrayList;

public class Patient {
protected int id;
protected String firstName;
protected String lastName;
private ArrayList<String> allergies = new ArrayList<String>();
/*
 * sets the id firstname and lastname
 */
public Patient(int id, String firstName, String lastName)
{
 this.id = id;
 this.firstName = firstName;
 this.setLastName(lastName);
}/*
*adds allergy to the array list allergies
*/

public void addAllergy(String allergy)
{
	 allergies.add(allergy);
}
public String toString()
{
	return;
}
/*
 * returns lastname
 */
public String getLastName() {
	return lastName;
}
/*
 * sets last name
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}
}
