class Ex2
{
	public static void main(String[] args) 
	{
		//java.util.Scanner sc=new java.util.Scanner(System.in);//生一個鍵盤出來
		
		int i=10;
		/*
		while(i<=5)
		{
			System.out.println("i="+i+"\thello java");
			i++;
		}
		*/
		//System.out.println("i="+i+"\tError");
		do
		{
			if(i<=5)
			{
				i++;
				System.out.println("i="+i+"\thello java");
			}
			else
			{
				System.out.println("i="+i+"\tError");
			}
		}while(i<=5);

		System.out.println("i="+i);
	}
}