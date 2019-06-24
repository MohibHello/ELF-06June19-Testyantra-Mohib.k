package com.testyantra.javaapp.array;

import java.util.Arrays;

import lombok.extern.java.Log;

@Log
public class ArrayCompare {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3, 4 };
		int[] arr2 = new int[] { 1, 6, 3, 4 };
		log.info("is arr1 equals to arr2 : " + Arrays.equals(arr1, arr2));
	}

}
