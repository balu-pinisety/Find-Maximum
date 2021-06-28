package com.FindMaximum;

/**
 * @author BALU
 * To find the maximum among different values by using Variables
 * Variables are of Wrapper Class Integer, Double and String type
 */
public class FindMaximum<T extends Comparable<T>> {
	private T[] inputArray;
	
	public FindMaximum(T[] inputArray) {
		this.inputArray = inputArray;
	}
	
	public T getMaximum() {
		return FindMaximum.getMaximum(this.inputArray);
	}

	/** 
	 * Method to find Maximum Using Generic
	 * Ability to take values by variables which are Wrapper class Type  
	 * To find the maximum of values using compareTo method
	 * Prints the maximum value
	 * @param x, y, z
	 * @return 
	 */
	private static <T extends Comparable<T>> T getMaximum(T[] inputArray) {
		T max=inputArray[0];//Initializing the Variable
		for(T element : inputArray) {
			if (element.compareTo(max)>0) {
			max=element;
			}
		}
		printOut(inputArray, max);
		return max;
	}
	
	private static <T> void printOut(T[] array,T big) {
		System.out.print("Maximum of ");
		for(T element : array) {
			System.out.printf("%s  ", element);
		}
		//Printing the max value
		System.out.printf("is %s\n",big);
	}

	/**
	 * To assign the values to Wrapper class type Variables 
	 * Calling method to find the maximum using parameters
	 */
	public static void main(String[] args) {
		//To display Welcome Message
		System.out.println("Program To find the Maximum among different values");
		// Initializing the Variables
		Integer[] intArray = {48,55,89,78,92,48,56,35};
		Float[] floatArray = {48.5f,55.56f,89.48f,48.84f,48.89f,56.55f,35.48f};
		String[] stringArray = {"apple","peach","banana","pinapple","orange"};
		// Calling method to mind maximum
		new FindMaximum(intArray).getMaximum();
		new FindMaximum(floatArray).getMaximum();
		new FindMaximum(stringArray).getMaximum();
	}
	
}