/**
 * <threeHeads used this citation https://stackoverflow.com/questions/27917444/how-do-i-create-a-java-random-number-generator-that-creates-3-numbers-using-seed 
 * Used this to understand better on how to use seeding a random number generator.>
 * 
 * @author <Hyunggil Woo>
 */

import java.util.*;

public class Ch05{
	public static void main(String[]args){
		printFactors(24);
		threeHeads(12345);
		digitSum(-123456);
		isAllVowels("aeioeio");
	}
     public static void printFactors(int n){
		 
		// Throws illegal argument
		if ( n <= 0) {
			throw new IllegalArgumentException ("n must be greater than 0");
		}
			System.out.print(n/n); // prints 1
			
		for (int i = n-1; i >= 1; i--){
			if ( (n % i) == 0) {
			System.out.print( " and " + n/i); // Prints "and" and factors of n.
			
			}
         }
         System.out.println();
	}
	/*-----------------------------------------------------------------
	 * The threeHeads turns head if the random number can generate boolean values.
	 * I learned to use a counter head, which is the value of interest. It makes sense to count
	 * only heads even when outputing tails.
	 * I struggled finding a solution create if else statement with even and odd number,
	 * because I had to account for 0 as well. 
	 * I gained inspiration from https://stackoverflow.com/questions/27917444/how-do-i-create-a-java-random-number-generator-that-creates-3-numbers-using-seed 
	 * However, I got help from classmates and finally concluded that 
	 * I should use boolean.
	 * 
	-----------------------------------------------------------------*/
	public static void threeHeads(int seed){
    Random rand = new Random(seed);
    int head = 0; // This is a counter to count the number of head. 
			while ( head < 3 ){
				boolean n = rand.nextBoolean();
				
					if (n == true) { // flip head if random number is even
                        System.out.print("H ");
                        head++;
                    } else { // flip tail if random number is odd
                        System.out.print("T ");
                        head = 0; 
                      }   
			}
		System.out.println();
		System.out.print("Three heads in a row!");
	}
	/*------------------------------------------------------------------
	 * I struggled if there was a method for an integer to locate the
	 * digits possibly converting them into a string, and possibly use a
	 * similar to charAt() to call on a number similar to it. Then, I 
	 * got an inspiration from using the same integer.
	 * 
	 * 
	 ----------------------------------------------------------------*/
	public static int digitSum(int n){
		
		int sum = 0;
		
		while ( n != 0) {
			if ( n > 0) {
				sum += n % 10;
				n /=10;
			} else {
				n = Math.abs( n);
			}
				
		} 
			return sum;
	}
	
	/*
	 * Learned from Java api that isVowels.indexOf(s.charAt(i)) locates 
	 * the index in isVowels where the s.charAt(i) is. Normally, if a 
	 * letter in the index is found, it will output integer from 0 to 
	 * positive integer. If no character is found, -1 will be yielded.
	 * I wondered if I could return a boolean answer from the boolean expression
	 * (isVowels.indexOf(s.charAt(i)) == -1);, but return statement will return back to the top 
	 * without performing the necessary for loop.
	 * So I took the inspiration from https://github.com/ramakastriot/practiceit/blob/master/chapter5/isAllVowels.java
	 * However, I believed I did a due dilligence of understanding the methods
	 * and trying to find alternative way to solve the problem.
	 * 
	 */
	public static boolean isAllVowels(String s){
		if (s == null) {
			throw new IllegalArgumentException("String cannot be null");
		}
		if (s ==" ") {
			throw new IllegalArgumentException("true"); //empty string is still true because there is no non-vowel characters.
		}
	
		String isVowels = "aeiouAEIOU";
		for(int i = 0; i < s.length(); i++) {
			if (isVowels.indexOf(s.charAt(i)) == -1) 
				return false;
		} 
			return true;			
	}
	
}
