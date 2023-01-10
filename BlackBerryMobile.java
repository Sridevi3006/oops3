package oops3;

public class BlackBerryMobile implements Mobile {
	public String call(boolean isVideoCall) {
		if(isVideoCall== true) {
			return "It supports video call";
		}
		else {
			return "does supports video call";
		}
	}
	public String  supports5G(String networkType) {
		if(networkType.equals("5G")) {
			return "it supports 2g,3g,4g,5g";
		}
		else if(networkType.equals("4G")) {
			return "it supports 2G,3G,4G";
		}
		else if(networkType.equals("3G")) {
			return "it supports 2G,3G";
			
		}
		else if(networkType.equals("2G")) {
			return "it supports 2G";
			
		}
		else {
			return "not a network";
		}
	
		
	}
	public void keypadType() {
		System.out.println("alphabetic keyword");
	}
}
