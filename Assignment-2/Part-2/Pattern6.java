/*

*********
 *******
  *****
   ***
    *

	Obsevation:
		
*/

class Pattern6
{
	public static void main(String args[])
	{
		for(int i=9; i>0; i-=2)
		{
			for (int j=9; j>i+1; j-=2)// for space
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
	