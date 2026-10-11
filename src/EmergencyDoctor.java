/**
 * Lab3_Robert Blick_F2026
 */
public class EmergencyDoctor extends Doctor implements MedicalProfessional, Billable
{
	public EmergencyDoctor(int personID, String name, int age, String specialization, 
			double consultationFee)
	{
		super(personID, name, age, specialization, consultationFee);
	
	}
	
	@Override
	public String toString()
	{
	    return "#" + personID + ", " + name + ", " + age + ", " + specialization + ", fee: $" + 
	consultationFee;
	}
	
	public void handleEmergency()
	{
		System.out.println("Handling emergencies");
	}
	
	@Override
	public void prescribeMedication()
	{
		System.out.println(name + " is prescribing medication.");
	}
	
	@Override
	public void generateBill()
	{
		System.out.println("The bill is $" + consultationFee);
	}
	
	@Override
	public void performDuties()
	{
		System.out.println(name + " is performing emergeny doctor duties.");
	}
}