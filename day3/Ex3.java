/*
240508 Java Day3 中文測試
javac -encoding utf-8 Ex1.java
*/
class Ex3
{
	public static void main(String[] args)
	{
		int x=10;
		//short y=x;//不會過，int比較大塞不進short()
		long x2=10;//long有64bit長
		float y=x2;//float有32bit長,但小數優先整數，所以把long的10塞進去
		float y2=10.2f;
		//long y3=y2;//不給塞 優先度float>long

		System.out.println(10/3);
		System.out.println(1/3);
		System.out.println(1/3+10);
		System.out.println(1./3+10);
		System.out.println(1/3+10.);
		int a=1;
		int b=3;
		double c=10;
		System.out.println(a/b+c);//abc先帶進去再計算，變成跟上一行輸出一樣
		int d=a/b+c;//不會過，先算右邊，a/b還在整數ok,卡在+c變成double

	}
}