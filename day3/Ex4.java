/*
240508 Java Day3 中文測試
javac -encoding utf-8 Ex1.java
*/
class Ex4
{
	public static void main(String[] args)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("請輸入A數量");
		int A;
		A=sc.nextInt();

		System.out.println("請輸入B數量");
		int B;
		B=sc.nextInt();

		System.out.println(
			"========================="+
			"\n訂單細目:"+
			"\nA:"+A+"*150元"+
			"\nB:"+B+"*120元"+
			"\n共"+(A*150+B*120)+"元");
	}
}