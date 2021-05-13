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
		threeHeads(52);
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
         
	}
	
	public static void threeHeads(int seed){
    Random rand = new Random(seed);
    int head = 0;
			while ( head < 3 ){
				int n = rand.nextInt(99);
				//int random=1+randomNumbers.nextInt(8);

                    if ( (n % 2) > 0) {
                        System.out.print("H ");
                        head++;
                    } else {
                        System.out.print("T ");
                        head = 0; 
                      }   
			}
		System.out.println();
		System.out.print("Three heads in a row!");
	}
	
	    //----The code generates a heads or tails.
    //Random rand = new Random(20);
    //mystery(rand.nextLine("H H H"));
    //for(int i =1; i < 10;i++){
    //System.out.println(rand.nextInt(10));
    // System.out.print(number);

    // while ( Variable z != "H H H"){
        // if ( (mystery % 2) > 0) {
            // System.out.print("H "); }
        // else {
            // System.out.print("T "); } 
    //}
    // System.out.println();
    // System.out.print("Three heads in a row!");
}
