[![Work in Repl.it](https://classroom.github.com/assets/work-in-replit-14baed9a392b3a25080506f3b7b6d57f295ec2978f6f33ec97e36a161684cbe9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=4730910&assignment_repo_type=AssignmentRepo)
# Chapter 05: Program Logic and Indefinite Loops


- 5.9  printFactors




Extra Credit: Project 5.1 pigLatin

- 5.11 threeHeads (needs to take a seed as a parameter)
The threeHeads turns head if the random number can generate boolean values.
	 * I learned to use a counter head, which is the value of interest. It makes sense to count
	 * only heads even when outputing tails.
	 * I struggled finding a solution create if else statement with even and odd number,
	 * because I had to account for 0 as well. 
	 * I gained inspiration from https://stackoverflow.com/questions/27917444/how-do-i-create-a-java-random-number-generator-that-creates-3-numbers-using-seed 
	 * However, I got help from classmates and finally concluded that 
	 * I should use boolean.

- 5.18 digitSum
- * I struggled if there was a method for an integer to locate the
	 * digits possibly converting them into a string, and possibly use a
	 * similar to charAt() to call on a number similar to it. Then, I 
	 * got an inspiration from using the same integer.
	 * 

- 5.24 isAllVowels
-  * Learned from Java api that isVowels.indexOf(s.charAt(i)) locates 
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
