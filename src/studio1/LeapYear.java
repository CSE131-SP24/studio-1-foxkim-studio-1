package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is the Year?");
		int year = in.nextInt();
		boolean isLeap = true;
		if (year%400==0 || year%4 == 0 && year%100!=0) {
			isLeap = true;
		}
			else {
				isLeap = false;
			}
		
	System.out.print(year + " is a leap year: " + isLeap);
	}

}
