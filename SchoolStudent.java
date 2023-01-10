package oops3;

public class SchoolStudent extends Student{
	public void studentType(int marks) {
		if(marks >=80 && marks<=100) {
			System.out.println("topper");
		}
		else if(marks>=50 && marks<=80) {
			System.out.println("good");
		}
		else {
			System.out.println("poor");
		}
	}
	public String findSchooling(int std) {
		if(std>=1 && std<=5) {
			return "Primary";
			
		}
		else if(std>=6 && std<=10) {
			return "secondary";
			
		}
		else if(std>=11 && std<=12) {
			return "highersecondary";
		}
		else {
			return "invalid";
		}
	}

}
