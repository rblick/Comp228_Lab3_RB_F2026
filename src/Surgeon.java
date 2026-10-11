/**
 * Lab3_Robert Blick_F2026
 */

public class Surgeon extends Doctor
{
	private String surgeryType;
	private int operatingRoom;
	
	public Surgeon(int personID, String name, int age, String specialization, 
			double consultationFee, String surgeryType, int operatingRoom)
	{
		super(personID, name, age, specialization, consultationFee);
		this.surgeryType = surgeryType;
		this.operatingRoom = operatingRoom;
	}
	
	@Override
	public String toString()
	{
	    return "#" + personID + ", " + name + ", " + age + ", " + specialization + ", fee: $" + 
	consultationFee + ", Surgery Type" + surgeryType + ", Room #" + operatingRoom;
	}
	
	public void performSurgery()
	{
		System.out.println("Operation in progress");
	}
	
	@Override
	public void performDuties()
	{
		System.out.println(name + " is performing surgeon duties.");
	}
}	

