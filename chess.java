class Chess
{
	public static void main(String[] args)
	{
		int rows=5;
		for(int r=1; r<=rows; r++)
		{
			for(int c=1; c<=rows; c++)
			{
				if(r%2!=0)
					System.out.print("* ");
			}
			for(int c=1; c<=rows-1; c++)
			{
				if(r%2==0)
					System.out.print(" *");
			}
			System.out.println();
		}
	}
}



//* * * * *
// * * * *
//* * * * *
// * * * *
//* * * * *