/*=============================================================================
| Assignment: CALENDAR
| Author: SPENCER KLINGE
| Sect. Leader: KRISTLE
|
| Course: CSc 227
| Instructor: L. McCann
| Due Date: Feb 4th, 2014, by 9:00 p.m. MST
|
| Description: This program, given the month and year by the user, formats and
			displays a month long calendar according to Babwani's Congruence,
			as apposed to the Gregorian Calander.
|
| Deficiencies: None known; this program meets specifications.
*===========================================================================*/


import java.util.*;
public class Calendar {
	public static void main(String args[]){
		int days=31; //days in the month
		int month; //month code
		int cen; //first 2 digets of the year
		int year; 
		double decade; //last 2 digets of year
		int monthCode=0;
		int firstDay; //first week day of the month
		Scanner keyboard;
			
		System.out.print("Please enter the number of the month (1-12):");
		keyboard= new Scanner(System.in);
		do{ month= keyboard.nextInt();
		}
		while(month<0 || month > 12);
		
		System.out.print("Pleae enter the year:");
		do{year= keyboard.nextInt();
		} while(year<0);
		cen= year/100;
		decade= year %1000;
		System.out.println("Su Mo Tu We Th Fr Sa"); 

			switch(month){
			case 1: monthCode=0;
			days=31;
			break;
			case 2: monthCode=3;
			days=28;
			break;
			case 3: monthCode=3;
			days=31;
			break;
			case 4: monthCode=6;
			days=30;
			break;
			case 5: monthCode=1;
			days=31;
			break;
			case 6: monthCode=4;
			days=30;
			break;
			case 7: monthCode=6;
			days=31;
			break;
			case 8: monthCode=2;
			days=31;
			break;
			case 9: monthCode=5;
			days=30;
			break;
			case 10: monthCode=0;
			days=31;
			break;
			case 11: monthCode=3;
			days=30;
			break;
			case 12: monthCode=5;
			days=31;
			break;
		}//switch
		//if
		firstDay= (int) ((Math.floor((5*decade)/4) + monthCode + 1 -2*(cen%4) + 7)) % 7;
		int spaces;
		if(firstDay==0)
			 spaces=18;
		else{
		 spaces= 3*(firstDay-1);
		}
		 for(int i=0; i<spaces;i++)
			 System.out.print(" ");
		if(year % 400==0 && month == 1){
			monthCode=6;
			
		}//if
		if(year % 400==0 && month ==2){
			monthCode=2;
			days=29;
		
		}//if
		for(int i=1; i<= days; i++){
			if(i<10)
				System.out.print(" " + i + " ");
			else{
			System.out.print(+i +" ");
			}
			spaces+=3;
			if(spaces>=20){
				spaces=0;
				System.out.println();
			}
		}
		//for
	
	}//main
}//class

