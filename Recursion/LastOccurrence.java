/*
Q4.
Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
You should start traversing your array from 0, not from (N - 1). Do this recursively. Indexing in the array starts from 0.
*/

import java.util.Scanner;
class LastOccurrence{
	
	static void addElements(int[] arr){
		System.out.println("enter "+arr.length+"  elements");
		for (int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}	
	}
	static Scanner sc = new Scanner(System.in);
		static int container =-1;
	static int foundInArray(int[] arr, int key, int index) {
		if(index==arr.length){
			if(container>=0)
			return container;
			else
			return -1;
		}
		if (arr[index]==key){
			container=index;
		}
		return foundInArray(arr, key,index+1);
	}

	public static void main(String[] ar){
		System.out.println("size of array");
		
		int size=sc.nextInt();
		int[] arr = new int[size];
		addElements(arr);
		System.out.println("enter value to search");
		int key=sc.nextInt();
		int  index=0;
		System.out.println(foundInArray(arr, key, index));
		
	}
}