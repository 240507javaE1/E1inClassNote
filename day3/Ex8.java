class Ex8
{
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);//生一個鍵盤出來
		System.out.println("奇偶判斷:請輸入數字");
		System.out.println("========================");
		int number=sc.nextInt();//讀取鍵盤的整數,放進number
		if (number%2==0)
		{
			if(number<0)
			{
				System.out.println("負偶數");
			}
			else
			{
				System.out.println("正偶數");
			}			
		}
		else
		{
			if(number<0)
			{
				System.out.println("負奇數");
			}
			else
			{
				System.out.println("正奇數");
			}
		}


	}
}