/*
* * * * *
 * * * *
  * * *
   * *
    *
   * *
  * * *
 * * * *
* * * * *

*/

class Pattern14
{
	public static void main(String args[])
	{
		for (int i=1; i<=5; i++) // upper portion
		{
			for (int j=1; j<i; j++)// for spaces
			{
				System.out.print(" ");
			}
			for (int j=5; j>=i; j--)// for *
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i=2; i<=5; i++)// lower portion
		{
			for (int j=5; j>i; j--)// for spaces
			{
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}
