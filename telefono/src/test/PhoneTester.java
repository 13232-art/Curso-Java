package test;

import telefonos.Galaxy;
import telefonos.IPhone;

public class PhoneTester {

	public static void main(String[] args) {
		IPhone iphone = new IPhone("xr", 0, "ee34", "up lift");
		String s = iphone.ring();
        System.out.println("Ring: " + s);
        String u = iphone.unlock();
        System.out.println("Unlock: " + u);
        iphone.displayInfo();
        
        Galaxy galaxy = new Galaxy("rq", 13, "fx25", "xylophone");
        String r = galaxy.ring();
        System.out.println("Ring: " + r);
        String ul = galaxy.unlock();
        System.out.println("Unlock: " + ul);
        galaxy.displayInfo();
	}

}
