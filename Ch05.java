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
	 * The threeHeads turns head if the random number is odd and
	 * turns tail if random number is even. I learned to use a counter
	 * for head, which is the value of interest. It makes sense to count
	 * only heads even when outputing tails.
	 * I struggled where the random number variable should be located 
	 * in the while loop or outside of the loop. But it makes sense to
	 * be inside the while loop, so that new random number is generated 
	 * in each loop.
	 * I gained inspiration from https://stackoverflow.com/questions/27917444/how-do-i-create-a-java-random-number-generator-that-creates-3-numbers-using-seed 
	 * However, I believe I studied in great depth to complete the program by myself.
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
	
}
