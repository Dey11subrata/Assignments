/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2 
1
# col numbers are printing in low to higher order
# number of elements down the row decreasing. i.e outer loop will run from high to low
*/



class Pattern14
{
	public static void main(String args[])
	{
		for (int i=5; i>=1; i--)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
	}
	
}
