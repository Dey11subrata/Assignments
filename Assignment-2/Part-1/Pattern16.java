/*
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
*/
/*
	Obsevation:
	#	Along the col. same numbers are printing i.e col. numbers are required to be printed
	#	down the rows number of elements increasing i.e as row number increase number of itteration in col. increses
	#	col. number are printing in reverse order i.e inner loop work from high to low value
		
*/

class Pattern16
{
	public static void main(String args[])
	{
		for (int i=5; i>=1; i--)
		{
			for (int j=5; j>=i; j--)
				System.out.print(j+" ");
			
			System.out.println();
		}		
	}
}
	