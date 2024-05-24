class Ex10
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);//生一個鍵盤出來
		System.out.println("購物系統:");
		System.out.println("========================");
		System.out.println("商品資料");
		System.out.println("尺:29元");
		System.out.println("筆:34元");
		System.out.println("=========輸入商品數量===============");
		System.out.println("尺:數量");
		int ruler=sc.nextInt();//讀取鍵盤的整數,放進ruler
		System.out.println("筆:數量");
		int pen=sc.nextInt();//讀取鍵盤的整數,放進pen
		double sum=ruler*29+pen*34;
		System.out.println(
			"=========是否會員?==============="+
			"\n1)是會員"+
			"\n2)非會員"	);
		int menber=sc.nextInt();

		if(sum>=2000) sum=sum*0.95;
		if(menber==1) sum=sum*0.95;

		System.out.println(
			"尺:數量"+ruler+
			"\n筆:數量"+pen+
			"\n共:"+ruler+"*29+"+pen+"*34="+sum+"元");
		/*
		if(sum>=2000)
		{
			System.out.println("尺:數量"+ruler+"筆:數量"+pen+"");
			System.out.println("共");
		}
		*/
	}
}