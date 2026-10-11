/**
 * Lab3_Robert Blick_F2026
 */

public class Nurse extends Person
{
	private String department;
	private String shift;
	
	public Nurse(int personID, String name, int age, String department, String shift)
	{
		super(personID, name, age);
		this.department = department;
		this.shift = shift;
	}
	
	@Override
	public String toString()
	{
	    return "#" + personID + ", " + name + ", " + age + ", " + department + ", shift: " + shift;
	}
	
	public void assistPatient()
	{
		System.out.println("Preps patient for surgery");
	}
	
	@Override
	public void performDuties()
	{
		System.out.println(name + " is performing nurse duties.");
	}
}	

