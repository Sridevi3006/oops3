package oops3;

public class ItEmployee extends Employee{
	public int calculateSalary(int experience) {
		if(experience>=0 && experience<=2) {
			return 25000;
		}
		else if(experience>=3 && experience<=5) {
			return 45000;
		}
		
		else {
			return 68000;
		}
	
		
	}
	public void employeeType(boolean isPermanent) {
		if(isPermanent==true) {
			System.out.println("onroll");
		}
		else {
			System.out.println("crown");
		}
	}

}
