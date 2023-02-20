package org.ssglobal.training.codes.itemI;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// declare and initialize data
		double celsius = 0;
		double fahrenheit = 22.6;
		// calculate celsius equivalent
		celsius = (fahrenheit - 32) * 5 / 9;
		
		// output results
		System.out.println(fahrenheit + "\u00B0F = " + celsius+ "\u00B0C");
		/*
		 * Compiler Errors: 
		 * celsius should be double
		 * fahrenheit should be double
		 * celsius in the last print line is spelled wrong
		 * fahrenheit in the computation of double celsius is spelled wrong
		 * variable fahrenheit is spelled wrong in System.out.print( fahrenheit)
		 * U00B0F = should be u00B0F =
		 * use + to concat degree sign in printing fahrenheit
		 * use + to concat degree sign in printing celcius
		 * 
		 * Logic Errors:
		 * celsius should be set to 0 at first
		 * wrong computation for celsius
		 * the celsius should have just been declared after the declaration of fahrenheit
		 * 
		 * User-experience Errors:
		 * Wrong naming of class should have not include the x
		 * Wrong naming of variables, should start with small letter
		 * The ( String [] args ) should be (String[] args) only
		 * 
		 * Readbility Errors:
		 * We could've concat the value of celsius after the equal sign to make it more readable
		 */
	}

}
