/**
 * Lab3_Robert Blick_F2026
 */

public class Doctor extends Person
{
	public String specialization;
	public double consultationFee;
	
	public Doctor(int personID, String name, int age, String specialization, double consultationFee)
	{
		super(personID, name, age);
		this.specialization = specialization;
		this.consultationFee = consultationFee;
	}
	
	@Override
	public String toString()
	{
	    return "#" + personID + ", " + name + ", " + age + ", " + specialization + 
	    		", fee $" + consultationFee;
	}
	
	public void diagnosePatient()
	{
		System.out.println("Patient needs surgery");
	}
	
	@Override
	public void performDuties()
	{
		System.out.println(name + " is performing doctor duties.");
	}
}	

