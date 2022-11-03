// Q2.
//Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false. Do this recursively.

import java.util.Scanner;

class PresentInArray{
	static void addInArray(int[] arr){
		System.out.println("enter "+arr.length+" elements in array");		
		for (int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
		
		/*for (int x: arr){
			System.out.println(x);
		}*/	
	}

	static Scanner sc = new Scanner(System.in);

	static boolean findValueInArray(int[] arr, int key, int index) throws ArrayIndexOutOfBoundsException{
		if (arr[index]==key)
			return true;
		return findValueInArray(arr, key, ++index);
	}

	public static void main(String[] args){
		System.out.println("enter size of Array");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		addInArray(arr);
		System.out.println("Enter value to search in array");
		int key=sc.nextInt();
		int startIndex=0;
		try{
			System.out.println(findValueInArray(arr, key, startIndex ));
		}
		catch(Exception e){
			System.out.println("false");
		}
  }
}