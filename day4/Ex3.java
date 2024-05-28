class Ex3
{
	public static void main(String[] args) 
	{	java.util.Scanner sc=new java.util.Scanner(System.in);//生一個鍵盤出來
		System.out.println("輸入列數");         //寫點說明，叫使用者做啥
		int row=sc.nextInt();                  //把使用者的"整數"存起來
		System.out.println("輸入行數");         //寫點說明，叫使用者做啥
		int col=sc.nextInt();                  //把使用者的"整數"存起來
		System.out.println("========================");//做個分隔線

		outsideLoop:
		for(int loopy=1;loopy<=row;loopy++)
		{
			for(int loopi=1;loopi<=col;loopi=loopi+1)
			{
				if(loopi==4) break;
				if(loopy==5) break outsideLoop;
				System.out.print(loopi+"x"+loopy+"="+loopi*loopy+"\t");
			}
			System.out.println();
		}




		/*
		for(int i=1;i<=9;i=i+1)
		{
			System.out.print(i+"x1="+i*1+"\t");
		}
		System.out.println();

		for(int i=1;i<=9;i=i+1)
		{
			System.out.print(i+"x2="+i*2+"\t");
		}
		System.out.println();

		for(int i=1;i<=9;i=i+1)
		{
			System.out.print(i+"x3="+i*3+"\t");
		}
		System.out.println();
		*/








		System.out.println();
		System.out.println();
		/*
		System.out.print("1x1="+1*1+"\t");
		System.out.print("2x1="+2*1+"\t");
		System.out.print("3x1="+3*1+"\t");
		System.out.print("4x1="+4*1+"\t");
		System.out.print("5x1="+5*1+"\t");
		*/


	}
}