package com.testyantra.javaapp.array;
import lombok.extern.java.Log;

@Log
import java.util.Arrays;
@Log
public class ArraySort {

	public static void main(String[] args) {
		int temp;
		double temp2;
		int[] a = { 1, 2, 5, 4, 3 };
		double[] ar2 = { 2.4, 3.4, 1.1, 5.4, 4 };

		Arrays.sort(a);

		for (int i = 0; i < a.length; i++) {
			log.info(""+a[i]);
		}

		Arrays.sort(ar2);

		for (int i = 0; i < ar2.length; i++) {
			log.info(""+ar2[i]);
		}

	}
}
