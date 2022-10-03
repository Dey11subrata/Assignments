/*
        9
       89 8
      789 87
     6789 876
    56789 8765
   456789 87654
  3456789 876543
 23456789 8765432
123654789 87654321

*/

class Pyramid5
{
	public static void main(String args[])
	{
		// combination of two patterns
		for (int i=9; i>=1; i--)
		{
			for (int j=i; j>1; j--)// spaces
			{
				System.out.print(" ");
			}
			for (int j=i; j<=9; j++)
			{
				System.out.print(j);
			}
			
			for (int j=8; j>=i; j--)
			{
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		
	}
}