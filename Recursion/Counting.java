//Q5.
//Given is the code to print numbers from 1 to n in increasing order recursively.

import java.util.Scanner;

class Counting{
	static void printCount(int n, int i){
		if(i==n){
			System.out.print(i);
			return;
		}
		System.out.print(i+" ");
		printCount(n,i+1);
	}
	public static void main(String[] args){
		System.out.println("enter number to print counting:");
		int n=new Scanner(System.in).nextInt();
		int i=1;
		printCount(n,i);
	}
}