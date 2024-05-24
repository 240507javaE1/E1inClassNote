class Ex1
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);//生一個鍵盤出來
		System.out.println("輸入次數");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			//if(i==12) break;
			if(i>=12 && i<20) continue;
			if(i==30) break;
			System.out.println("i="+i+"\thello java");
		}
		/*
		for(int x=1,y=2;x<=50000 || y<=55000;)
		{
			System.out.println("x="+x+"\ty="+y);
			x=2*y+50;
			y=2*x+100;
		}
		//System.out.println("x="+x+"\ty="+y);//for-loop後xy會消滅
		*/

		/*
		System.out.println("hello java");		
		System.out.println("hello java");		
		System.out.println("hello java");
		System.out.println("hello java");
		System.out.println("hello java");
		*/
	}
}