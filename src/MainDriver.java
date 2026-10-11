/**
 * Lab3_Robert Blick_F2026
 */

public class MainDriver 
{
	public static void main(String[] args) 
	{
		//objects and methods 
		Doctor d = new Doctor(101, "Jane Smith", 42, "Ears, Nose, and Throat", 99.89);
		System.out.println(d);
		d.performDuties();
		d.diagnosePatient();
		System.out.println("");
		
		Nurse n = new Nurse(102, "John Smith", 33, "ER", "Nightshift");
		System.out.println(n);
		n.performDuties();
		n.assistPatient();
		System.out.println("");
		
		Surgeon s = new Surgeon(103, "Jack Daniels", 39, "Brain", 150.89, "Brain Surgery", 204);
		System.out.println(s);
		s.performDuties();
		s.performSurgery();
		System.out.println("");
		
		EmergencyDoctor ed = new EmergencyDoctor(104, "Jill Daniels", 51, "Medic", 122.10);
		System.out.println(ed);
		ed.performDuties();
		ed.handleEmergency();
		ed.prescribeMedication();
		ed.generateBill();
		System.out.println("");
		
		//polymorphism 
		Person person;
		person = d;
		person.performDuties();
		person = n;
		person.performDuties();
		person = s;
		person.performDuties();
		person = ed;
		person.performDuties();
	}
}

