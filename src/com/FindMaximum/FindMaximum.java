package com.FindMaximum;

/**
 * @author BALU
 * To find the maximum among different values by using Variables
 * Variables are of Wrapper Class Integer, Double and String type
 */
public class FindMaximum<T extends Comparable<T>> {
	//Instance Variable for Generic array
	private T[] inputArray;
	//Constructor
	public FindMaximum(T[] inputArray) {
		this.inputArray = inputArray;
	}
	//Calling method to find Maximum Value 
	public T getMaximum() {
		return FindMaximum.getMaximum(this.inputArray);
	}

	/** 
	 * Method to find Maximum Using Generic
	 * Ability to take values by variables from array which are Wrapper class Type  
	 * To find the maximum of values using compareTo method
	 * Prints the maximum value
	 * @param <T>, inputArray
	 * @return max
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
	
	/**
	 * To print all the values using array
	 * to print the max value
	 * @param <T>, array, big
	 */
	private static <T> void printOut(T[] array,T big) {
		System.out.print("Maximum of ");
		for(T element : array) {
			System.out.printf("%s  ", element);
		}
		//Printing the max value
		System.out.printf("is %s\n",big);
	}

	/**
	 * To assign the values to Wrapper class type Array 
	 * Calling method to find the maximum using array
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