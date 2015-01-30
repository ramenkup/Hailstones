/*=============================================================================
| Assignment: HAILSTONES
| Author: SPENCER KLINGE
| Sect. Leader: KRISTLE
|
| Course: CSc 227
| Instructor: L. McCann
| Due Date: Feb 4th, 2014, by 9:00 p.m. MST
|
| Description: This class, is made up of a single main method, which, given any positive
|	integer, outputs the stream of values computed through the 3n+1 Conjecture. 
|	The program first determines if the number is either even or odd, then completes 
|	the proper operation. After outputting, the values, the program then outputs the number of values
|
| Deficiencies: None known; this program meets specifications.
*===========================================================================*/




import java.util.*;
import java.lang.*;
public class Hailstones {

	
	public static void main(String args[]){
		int counter=1;
		int userInput;
		Scanner keyboard;
		keyboard= new Scanner(System.in);
		
		System.out.print("Please enter a positive starting value for the hailstone sequence:");
		do{userInput= keyboard.nextInt();
		
		} while(userInput< 0);
		int userInputCopy= userInput;
		System.out.print(userInput + " ");
		while(userInput != 1 && userInput != 0){
			if(userInput % 2 == 0){
				userInput/=2;
				counter++;
				System.out.print(userInput + " ");
			}//if
			else{ userInput= (userInput*3)+1;
			counter++;
			System.out.print(userInput + " ");
			}//else
				
		}//while
		System.out.println("\n The hailstone sequence contains " + counter + " hailstones," 
		+ "and the largest value in the sequence is " + userInputCopy);
		
		
	}//main
}//classHailstones
