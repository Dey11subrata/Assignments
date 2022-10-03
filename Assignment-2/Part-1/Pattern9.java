/*
    A 				A
   A B 				A B
  A B C				A B C 
 A B C D 			A B C D 
A B C D E			A B C D E 
*/

class Pattern9
{
	public static void main(String args[])
	{
		
		for (char i='A';i<='E'; i++ )
		{
			// for spaces
			for (int j='E'; j>i; j--)
			{
				System.out.print(" ");
			}
			// for characters
			for (char j='A'; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
	}
}