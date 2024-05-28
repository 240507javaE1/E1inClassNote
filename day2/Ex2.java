/*
240508 Java Day2 中文測試
javac -encoding utf-8 Ex1.java
*/
/*
浮點數
字元
布林

*/
class Ex2
{
	public static void main(String[] args)
	{
		double x=10.;
		float x2=(float)10.12;
		float x3=10.12f;//float
		float x4=10.12F;//java.lang.Float
		System.out.println(x3+" ,||, "+x4);
		System.out.println("================");
		char a1=65;
		char a2=66;
		char a3=10;
		char a4=67;
		System.out.println(a1+","+a2+"||"+a3+","+a4);
		System.out.println("==================");
		boolean y=true;//false
		String x5="asd\bhfa\bkl";
		System.out.println(x5);
	}
}