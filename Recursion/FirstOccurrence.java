//Q3.
//Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.

import java.util.Scanner;
class FirstOccurrence{
	
	static void addElements(int[] arr){
		System.out.println("enter "+arr.length+"  elements");
		for (int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}	
	}
	static Scanner sc = new Scanner(System.in);

	static int foundInArray(int[] arr, int key, int index) {
		if (index==arr.length)
			return -1;
		if (arr[index]==key)
		return index;
		
		return foundInArray(arr, key, index+1);
	}

	public static void main(String[] ar){
		System.out.println("size of array");
		
		int size=sc.nextInt();
		int[] arr = new int[size];
		addElements(arr);
		System.out.println("enter value to search");
		int key=sc.nextInt();
		int  index=0;
		//try {
			System.out.println(foundInArray(arr, key, index));
			//}
		//catch(Exception e){
		//	System.out.println("value not available in array......");
		//}
	}
}