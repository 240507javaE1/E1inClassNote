class Ex7
{
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);//生一個鍵盤出來
		System.out.println("輸入會員等級:\n1)vIP\n2)金卡\n3)銀卡\n4)普通會員:");

		int member=sc.nextInt();//讀取鍵盤的整數,放進member
		//long member=1;
		//char member='A';
		//String member="A002";
		//String member=sc.next();//讀取鍵盤的任何字,放進member
		System.out.println(member);
		System.out.println("========================");
		switch(member)
		{
			case //"A001"://case 1:
				System.out.println("VIP");
				break;
			case //"A002"://case 2:
				System.out.println("金卡");
				break;
			case //"A003"://case 3:
				System.out.println("銀卡");
				break;
			case "A004"://case 4:
				System.out.println("普通會員");
				break;
			default:
				System.out.println("重填 1~4");
		}
	}
}