package com.testyantra.javaapp.lombok;

public class MyArrayList {

	private Object[] myArray;
	private int index;

	public MyArrayList() {
		this(10);
	}

	public MyArrayList(int size) {
		if (size <= 0) {
			throw new ArrayIndexOutOfBoundsException("size should be greater than 0");
		} else {
			myArray = new Object[size];
			index = 0;
		}
	}

	public void add(Object val) {

		if (index >= myArray.length) {
			Object[] myArray2 = new Object[myArray.length + myArray.length];

			System.arraycopy(myArray, 0, myArray2, 0, myArray.length - 1);
			myArray = myArray2;
		} else {
			myArray[index] = val;
			index++;
		}
	}

	public void remove(int pos) {

		if (pos >= myArray.length) {
			throw new ArrayIndexOutOfBoundsException("size should not exceed array size");
		} else {
			myArray[pos] = null;
			System.arraycopy(myArray, pos + 1, myArray, pos, myArray.length - 1 - pos);
		}
		/*
		 * for (int i = pos; i < myArray.length - 1; i++) { myArray[i] = myArray[i + 1];
		 * }
		 */
	}

	public Object get(int pos) {

		return myArray[pos];
	}

	public int size() {
		return index - 1;
	}

}
