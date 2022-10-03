/*
        *
      * *
    * * *			This pattern is combination of spaces and * Apply 2 loops for each entity
  * * * *
* * * * * 
*/

class Pattern6
{
	public static void main(String args[])
	{
		for (int i=1; i<=5; i++)
		{
			// for spaces
			// number of spaces decreases as row increases. i.e printing must be in higher to lower order
			// also 1st row have 4 spaces & 5th row do not have any space. i.e itteration should be =4 or <5
			for (int j=5; j>i; j--)
			{
				System.out.print("_ ");
			}
			
			// for *
			// number of * increases as number of row increase. i.e. printing must be from lower to higher order
			for (int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}