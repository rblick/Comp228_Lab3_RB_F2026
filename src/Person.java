/**
 * Midterm_RobertBlick_Fall2026
 */

public abstract class Person 
{
	final int personId;
	String name;
	String phoneNumber;
	static int personCount;
	
	public Person(int personId, String name, String phoneNumber, int personCount) 
	{
		this.personId = personId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.personCount = personCount;
	}
	
	abstract String getRoleDescription();
}

