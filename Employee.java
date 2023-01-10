package oops3;

public abstract class Employee {
	public abstract int calculateSalary(int experience);
	public void printCompany(String company) {
		System.out.println("The company name is "+company);
	}
	public abstract void employeeType(boolean ispermanent);

}
