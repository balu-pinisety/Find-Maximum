package com.FindMaximum;

/**
 * @author BALU
 * To find the maximum among different values by using Variables
 * Variables are of Wrapper Class Integer, Double and String type
 */
public class FindMaximum<T extends Comparable<T>> {
	private T firstValue, secondValue, thirdValue;
	
	public FindMaximum(T firstInput, T secondInput, T thirdInput) {
		this.firstValue = firstInput;
		this.secondValue = secondInput;
		this.thirdValue = thirdInput;
	}
	
	public T getMaximum() {
		return FindMaximum.getMaximum(firstValue, secondValue, thirdValue);
	}

	/** 
	 * Method to find Maximum Using Generic
	 * Ability to take values by variables which are Wrapper class Type  
	 * To find the maximum of values using compareTo method
	 * Prints the maximum value
	 * @param x, y, z
	 * @return 
	 */
	private static <T extends Comparable<T>> T getMaximum(T x, T y, T z) {
		T max=x;//Initializing the Variable
		if (y.compareTo(x)>0) {
			max=y;
		}
		if (z.compareTo(max)>0) {
			max=z;
		}
		printOut(x, y, z, max);
		return max;
	}
	
	private static <T> void printOut(T i, T j, T k, T big) {
		//Printing the max value
		System.out.printf("Maximum of %s, %s and %s is %s\n",i,j,k,big);
	}

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
		new FindMaximum(a,b,c).getMaximum();
		new FindMaximum(l,m,n).getMaximum();
		new FindMaximum(p,q,r).getMaximum();
	}
	
}