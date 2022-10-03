/*
        1
       1 2
      1 2 3
     1 2 3 4
    1 2 3 4 5
   1 2 3 4 5 6
  1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8 
1 2 3 4 5 6 7 8 9 
*/

class Pyramid2
{
	public static void main(String args[])
	{
		for (int i=1; i<10; i++)
		{
			for (int h=9; h>i; h--)// spaces
			{
				System.out.print(" ");
			}
			
			for (int h=1; h<=i; h++)
			{
				System.out.print(h+" ");
			}
			
			System.out.println();
		}
	}
}