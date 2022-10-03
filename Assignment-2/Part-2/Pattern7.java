/*
    *
   ***
  *****
 *******
*********   combinationof two patterns
 *******
  *****
   ***
    *

	Obsevation:
	#	combinationof two patterns
*/

class Pattern7
{
	public static void main(String args[])
	{
			// design upper portion
		for (int i=1; i<10; i+=2)
		{
			for (int j=10; j>i+1; j-=2)// for spaces
			{
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++)// for *
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
			// designing lower portion & remove the common line
			for (int i=7; i>0; i-=2)
		{
			for (int j=9; j>i+1; j-=2)// for spaces
			{
				System.out.print(" ");
			}
			for (int j=i; j>0; j--)// for *
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
			
	}
}
	