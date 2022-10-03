/*

    *
   ***
  *****
 *******
*********


	Obsevation:
		
*/

class Pattern5
{
	public static void main(String args[])
	{
		for(int i=1; i<10; i+=2)
		{
			for (int j=10; j>i+1; j-=2)// for space
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
	