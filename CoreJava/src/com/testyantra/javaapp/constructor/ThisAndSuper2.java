package com.testyantra.javaapp.constructor;

public class ThisAndSuper2 {
	int i = 10;

}

class ThisAndSuper extends ThisAndSuper2 {
	int i = 20;

	public ThisAndSuper() {
		int i = 30;
		System.out.println("Constructor i=" + i);
		System.out.println("THis" + this.i);
		System.out.println("super" + super.i);
	}

	public static void main(String[] args) {

		// ThisAndSuper e2=new ThisAndSuper();

	}
}
