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
		Float l=33.48f, m=68.76f, n=45.72f;
		String p="apple",q="peach",r="banana";
		// Calling method to mind maximum
		getMaximum(a,b,c);
		getMaximum(l,m,n);
		getMaximum(p,q,r);
	}

	/** 
	 * Method to find Maximum Using Generic
	 * Ability to take values by variables which are Wrapper class Type  
	 * To find the maximum of values using compareTo method
	 * Prints the maximum value
	 * @param x, y, z
	 */
	private static <T extends Comparable> void getMaximum(T x, T y, T z) {
		T max=x;//Initializing the Variable
		if (y.compareTo(x)>0) {
			max=y;
		}
		if (z.compareTo(max)>0) {
			max=z;
		}
		System.out.println("Maximum of "+x+", "+y+", "+z+" is "+max);//Printing the max value
	}
	
}