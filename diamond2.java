class Diamond2
{
	public static void main(String[] args)
	{
		int rows=5;
		for(int r=1; r<=rows; r++)

		{
			for(int c=rows; c>r; c--)
			{
				System.out.print("  ");
			}
			for(int c=1; c<=r; c++)
			{
				System.out.print("*   ");
			}
			System.out.println();
		}
		for(int r=rows-1; r>=1; r--)
		{
			for(int c=rows; c>r; c--)
			{
				System.out.print("  ");
			}
			for(int c=r; c>=1; c--)
			{
				System.out.print("*   ");
			}
			System.out.println();
		}
	}
}



//        *
//      *   *
//    *   *   *
//  *   *   *   *
//*   *   *   *   *
//  *   *   *   *
//    *   *   *
//      *   *
//        *