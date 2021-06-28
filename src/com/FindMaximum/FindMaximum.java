package com.FindMaximum;

/**
 * @author BALU
 * To find the maximum among different values by using Variables
 * Variables are of Wrapper Class Integer, Double and String type
 */
public class FindMaximum {

	/**
	 * To assign the values to Wrapper class type Variables 
	 * Calling method to find the maximum using parameters
	 */
	public static void main(String[] args) {
		//To display Welcome Message
		System.out.println("Program To find the Maximum among different values");
		// Initializing the Variables
		Integer a=22, b=48, c=32;
		// Calling method to mind maximum
		intMaximum(a,b,c);
	}

	/** 
	 * Ability to take values by variables which are Wrapper class Integer Type  
	 * To find the maximum of values using compareTo method
	 * Prints the maximum value
	 * @param x, y, z
	 */
	private static void intMaximum(Integer x, Integer y, Integer z) {
		Integer max=x;//Initializing the Variable
		if (y.compareTo(x)>0) {
			max=y;
		}
		if (z.compareTo(max)>0) {
			max=z;
		}
		System.out.println("Maximum of "+x+", "+y+", "+z+" is "+max);//Printing the max value
	}
	
}
