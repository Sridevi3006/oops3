package oops3;

public class Car implements Automobile,Roadways{
	public String fuelType(boolean isDisel) {
		if(isDisel==true) {
			return "disel";
		}
		else {
			return "ispetrol";
		}
	}
	public int millage() {
		return 25;
	}
	public String noOftravellers(int seats) {
		return "nooftravellers "+seats;
	}

}
