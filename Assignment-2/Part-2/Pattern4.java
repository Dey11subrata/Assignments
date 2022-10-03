/*

*****
 ****
  ***
   **
    *


	Obsevation:
		
*/

class Pattern4
{
	public static void main(String args[])
	{
		for(int i=5; i>=1; i--)
		{
			for (int j=i; j<5; j++)// for space
			{
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++)// for *
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
	