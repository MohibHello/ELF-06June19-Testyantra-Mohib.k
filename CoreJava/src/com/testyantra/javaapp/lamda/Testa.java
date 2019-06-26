package com.testyantra.javaapp.lamda;

public class Testa {

	public static void main(String[] args) {

		Sum s = (a, b) -> {
			return a + b;
		};
		int res = s.add(4, 41);
		System.out.println(res);

		Factorial f = (a) -> {
			int h = 1;
			for (int i = 1; i <= a; i++) {

				h = h * i;

			}
			return h;
		};
		int res2 = f.fact(5);
		System.out.println("fact 5 = " + res2);

		Square q = a -> a * a;

		int res3 = q.square(5);

		System.out.println("square of 5 = " + res3);

		StringLength sl = str -> str.length();

		int res4 = sl.strlen("hello");

		System.out.println("string length = " + res4);
	}

}
