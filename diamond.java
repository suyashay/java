class Diamond
{
	public static void main(String[] args)
	{
		int rows=4;
		for(int r=1; r<=rows; r++)
		{
			for(int c=rows; c>=r; c--)
			{
				System.out.print("  ");
			}
			for(int x=2; x<=2*r; x++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int r=2; r<=rows; r++)
		{
			for(int c=1; c<=r; c++)
			{
				System.out.print("  ");
			}
			for(int x=rows*2; x>=r*2; x--)
			{				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}



//        *
//      * * *
//    * * * * *
//  * * * * * * *
//    * * * * *
//      * * *
//        *