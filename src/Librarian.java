/**
 * Midterm_RobertBlick_Fall2026
 */

public class Librarian extends LibraryStaff
{
	final int dailyIssueLimit;
	int booksProcessed;
	
	public Librarian(int personId, String name, String phoneNumber, int personCount, int staffId, 
			String department, double monthlySalary, int staffCount, int dailyIssueLimit, 
			int booksProcessed) 
	{
		super(personId, name, phoneNumber, personCount, staffId, department, monthlySalary, staffCount);
		this.dailyIssueLimit = dailyIssueLimit;
		this.booksProcessed = booksProcessed;
	}
	
	public String getRoleDescription() 
	{
		return name + " is a librarian.";
	}
	
	public void calculateMonthlyCompensation() 
	{
		final double processingAllowance = 0.1;
		double monthlyCompensation = (monthlySalary - (monthlySalary * processingAllowance));
		System.out.println(name + "'s monthly compensation is: $" + monthlyCompensation);
	}
	
	public void calculateLateFee(int daysLate) 
	{
		final double dailyLateFee = 0.01;
		double lateFees = (daysLate * dailyLateFee);
		System.out.println("Late fees are: $" + lateFees);
	}
	
}

