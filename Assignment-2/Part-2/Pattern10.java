/*
    *****
   *****
  *****
 *****
*****

*/

class Pattern10
{
	public static void main(String args[])
	{
		for (int i=1; i<=5; i++)
		{
			for (int j=5; j>i; j--)// for spaces
			{
				System.out.print(" ");
			}
			
			for (int j=1; j<=5; j++)// for *
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
