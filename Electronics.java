package oops3;

public abstract class Electronics {
	public String onOff(boolean ison) {
		if(ison==true) {
			return "its working";
		}
		else {
			return "its not working";
		}
	}
	public abstract void findWarranty(int price);

}
