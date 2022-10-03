/*

    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *

	Observation:
	#	combination of two patttern.
*/

class Pattern9
{
	public static void main(String args[])
	{
		int i,j;
		// framing upper pattern
		
		for (i=1; i<=5; i++)
		{
			// for spaces
			for (j=5; j>i; j--)
			{
				System.out.print(" ");
			}
			for (j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (i=1; i<=4; i++)
		{
			// for spaces
			for (j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for (j=4; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}