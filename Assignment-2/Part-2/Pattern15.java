/*
*				1
**				12
* *				1 3
*  *			1  4
*****			12345
*/
/*
	Obsevation:
		
*/

class Pattern15
{
	public static void main(String args[])
	{
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=i; j++)
			{
				if (i==5)
				{
					System.out.print("*");
				}
				else if (j==1 || j==i)
				{
					System.out.print("*");
					
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}
	