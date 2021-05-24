/*

Enter the number you want to check:
10
Given Number is Even!!!
			OR
Enter the number you want to check:
5
Given Number is Odd!!!

*/

package Logical_Code;

import java.util.Scanner;

public class OddEven 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number you want to check:");
		int n = scan.nextInt();
		
		if(n%2==0)
		{
			System.out.println("Given Number is Even!!!");
		}
		else
		{
			System.out.println("Given Number is Odd!!!");
		}	
	}
}
