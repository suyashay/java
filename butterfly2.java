class Butterfly2
{
	public static void main(String[] args)
	{
		int rows=5;
		for(int r=1; r<=rows; r++)
		{
			for(int c=1; c<=r; c++)
			{
				System.out.print("* ");
			}
			for(int z=rows*2; z>=r*2+1; z--)
			{
				System.out.print("  ");
			}
			for(int y=1; y<=r; y++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int r=rows-1; r>=1; r--)
		{
			for(int c=r; c>=1; c--)
			{
				System.out.print("* ");
			}
			for(int z=r*2; z<=rows*2-1; z++)
			{
				System.out.print("  ");
			}
			for(int y=r; y>=1; y--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}



//#               *
//#              * *
//# # #         * * *
//* * * *     * * * *
//* * * * * * * * * *
//* * * *     * * * *
//* * *         * * *
//* *             * *
//*                 *
