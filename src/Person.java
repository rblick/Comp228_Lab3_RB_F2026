/**
 * Lab3_Robert Blick_F2026
 */

public class Person 
{
	public int personID;
	public String name;
	public int age;
	
	public Person(int personID, String name, int age)
	{
		this.personID = personID;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString()
	{
	    return "#" + personID + ", " + name + ", " + age;
	}
	
	public void performDuties()
	{
		System.out.println(name + " is performing hospital duties.");
	}
}	

