package oops3;

public abstract class Student implements Human { 
	public abstract void studentType(int marks);
	
	public void sleep(int time) {
		if((time>=0 && time<=6) || (time>=21 && time<=24)) {
		System.out.println("Sleeping time");
	}
		else if(time>6 && time<21) {
			System.out.println("Working time");
		}
	}
	public String eat() {
		return "3 times a day";
	}
	public String work() {
		return "learning is his first work ";
	}
	
	

}
