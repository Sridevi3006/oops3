package oops3;

public class Laptop extends Electronics {
	public void findWarranty(int price) {
		if(price>=25000) {
			System.out.println("It has Warranty");
		}
		else {
			System.out.println("It does not have waraanty");
		}
	}

}
