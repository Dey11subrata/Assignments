
import java.util.Scanner;

class Expo{
	
	static int calcResult(int num, int exp){
		if (exp==0)
		return 1;
		
		return num*calcResult(num, exp-1);
	}
	public static void main(String[] args){
		System.out.println("Enter number followed by exponential value:	");
		Scanner sc=new Scanner(System.in);
		int numVal= sc.nextInt();
		int expVal=sc.nextInt();
		System.out.println(calcResult(numVal, expVal));
	}
}