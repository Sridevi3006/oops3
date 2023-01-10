package oops3;

public class UseItEmployee {
	public static void main(String[] args) {
		ItEmployee ie=new ItEmployee();
		ie.printCompany("TCS");
		System.out.println(ie.calculateSalary(4));
		ie.employeeType(true);
		
	}

}
