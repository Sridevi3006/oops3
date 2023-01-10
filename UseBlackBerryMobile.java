package oops3;

public class UseBlackBerryMobile {
	public static void main(String[] args) {
		BlackBerryMobile bm=new BlackBerryMobile();
		System.out.println(bm.call(true));
		System.out.println(bm.supports5G("5G"));
		bm.keypadType();
		
	}

}
