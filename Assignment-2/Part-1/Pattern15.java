/*
5 4 3 2 1 
5 4 3 2
5 4 3 
5 4 
5
*/
/*
	Obsevation:
	#	Along the row col. numbers are printing in reverse order.
		i.e run the inner loop from higher to lower values and print it.
	#	down the row number of col. are decreasing
		i.e as row value increase itteration of inner loop decreases
		
*/

class Pattern15
{
	public static void main(String args[])
	{
		for (int i=1; i<=5; i++)
		{
			for (int j=5; j>=i; j--)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
	}
}
	