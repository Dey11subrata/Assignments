/*
        1
       121
      12321
     1234321
    123454321
   12345654321
  1234567654321
 123456787654321
12345678987654321

*/

class Pyramid4
{
	public static void main(String args[])
	{
		// combination of two patterns
		
		for (int i=1; i<10; i++)
		{
			for (int j=9; j>i; j--)
			{
				System.out.print(" ");
			}
			
			for (int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			
			for (int j=i-1; j>=1; j--)
			{
				System.out.print(j);
			}
			
			System.out.println();
		}
		
	}
}