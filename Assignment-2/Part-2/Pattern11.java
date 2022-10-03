/*
*****
 *****
  *****
   *****
    *****

*/

class Pattern11
{
	public static void main(String args[])
	{
		for (int i=1; i<=5; i++)
		{
			for (int j=i; j>1; j--)
			{
				System.out.print(" ");
			}
			
			for (int h=1; h<=5; h++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
