//Q7.
//Given an array of length N, you need to find and return the sum of all elements of the array. Do this recursively.

import java.util.Scanner;
class SumOfElements{
	static Scanner sc=new Scanner(System.in);

	public static void addElements(int[] arr){
		for (int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

	}

	public static int arrayElementsSum(int[] arr, int index){
		if(index==arr.length-1)
			return arr[index];

		return (arr[index]+arrayElementsSum(arr, index+1));
	}

	public static void main(String[] args){
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int[] arr = new int[size];
		addElements(arr);
		/*for(int x: arr)
		System.out.println(x);
		*/
		int index = 0;
		System.out.println("Sum of all elements of array:	"+arrayElementsSum(arr, index));
	}
}