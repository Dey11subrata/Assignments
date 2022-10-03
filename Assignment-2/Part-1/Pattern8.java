/*
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5
*/

class Pattern8
{
	public static void main(String args[])
	{
		for (int i=5; i>=1; i--) // higher order at lower level- outer loop must be from higher to lower
		{	
			// Mnaging Space
			for (int j=i; j>1; j--)
			{
				System.out.print(" ");
			}
			
			// for numbers
			for (int j=i; j<=5; j++)
			{
				System.out.print(j+" "); // "* " space is provided to aling output
			}
			System.out.println();
		}
	}
}