/*
    E 				E
   D E 				D E
  C D E				C D E  
 B C D E			B C D E
A B C D E			A B C D E 
*/

// downward higher to lower value- i.e outer loop run from H->L value
// rightward lower to higher value- i.e inner loop for Alphabets run from L->H value.

class Pattern10
{
	public static void main(String args[])
	{
		for (char i='E'; i>='A'; i--)
		{
			// for spaces
			for (char j=i; j>'A'; j--)
			{
				System.out.print(" ");
			}
			for (char j=i; j<='E'; j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
	}
	
	
}