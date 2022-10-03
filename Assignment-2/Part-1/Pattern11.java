/*
    *			*
   ***			***
  *****			*****
 *******		*******
*********		*********
*/
// number of rows- 5. number of col.-9

class Pattern11
{
	public static void main(String args[])
	{
		for (int i=1; i<=10; i+=2)
	{
		// for spacex
		for (int j=10; j>i+1; j-=2)// i=1 - TO Eleminate execution of space when j=2.
		{
			System.out.print(" ");
		}
		// for *
		for (int j=1; j<=i; j++)// number of elements in a row is odd. Hence increment by 2
		{
			System.out.print("*");
		}
		
		System.out.println();
	}
	}
}
