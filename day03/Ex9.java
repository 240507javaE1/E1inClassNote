class Ex9
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);//生一個鍵盤出來
		System.out.println("錄取判斷:");
		System.out.println("========================");
		System.out.println("請輸入國文分數");
		int chinese=sc.nextInt();//讀取鍵盤的整數,放進chinese
		System.out.println("請輸入英文分數");
		int english=sc.nextInt();//讀取鍵盤的整數,放進english
		System.out.println("請輸入數學分數");
		int math=sc.nextInt();//讀取鍵盤的整數,放進math
		int sum=chinese+english+math;
		if(sum>=200)
		{
			if(english>=75)
			{
				System.out.println("總分="+sum+"英文="+english+",總分>=200,英文>75,恭喜錄取");
			}
			else
			{
				System.out.println("總分="+sum+"英文="+english+",英文未達75,不予錄取");
			}
		}
		else
		{
			System.out.println("總分="+sum+",總分未達200，不予錄取");
		}
	}
}