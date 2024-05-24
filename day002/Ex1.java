/*
240508 Java Day2 中文測試
javac -encoding utf-8 Ex1.java
*/
/*
整數 declare
1->casting
2->promotion->byte , short 的變數運算-->會將結果提升成-->int

*/
class Ex1
{
	public static void main(String[] args)
	{
		//System.out.println("hello java Ex1 ");
		byte x=(byte)130;
		System.out.println(x);
		System.out.println("=====================");
		byte a1=10;
		byte b1=20;
		byte c1=10+20;
		System.out.println(c1);
		//byte d1=a1+b1;//int a1+b1
		short d1=(short)(a1+b1);
		int d2=a1+b1;
		System.out.println(d2);
		System.out.println("=====================");
		short s1=10;
		short s2=20;
		short s3=10+20;
		//short s4=s1+s2;
		int s4=s1+s2;
		System.out.println(s4);
	}

}