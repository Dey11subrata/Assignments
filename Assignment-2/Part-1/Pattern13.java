/*
    A
   B B 
  C C C 
 D D D D 
E E E E E
*/


class Pattern13
{
	public static void main(String args[])
	{
		for (char i='A'; i<='E'; i++)
		{
			for (char j='E'; j>i; j--)// for space
			{
				System.out.print(" ");
			}
			
			for (char j='A'; j<=i; j++)// for characters
			{
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
	}
	
}
