//Q6.
//Given the code to find out and return the number of digits present in a number recursively. 

import java.util.Scanner;

class NumberOfDigit{
	static boolean status;
	public static int digit(int n){
		
		if(n==0)
		{
			if(status==false)
			return 1;
			else
			return 0;
		}
		
		status = true;

		return 1+digit(n/10);
	}
		
	public static void main(String[] args){
		System.out.println("Enter a number:");
		int n= new Scanner(System.in).nextInt();
		System.out.println(digit(n));
	}
}