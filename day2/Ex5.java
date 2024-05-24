/*
240508 Java Day2 中文測試
javac -encoding utf-8 Ex1.java
*/
/*

*/
class Ex5
{
	public static void main(String[] args)
	{
		int x=10;
		int y=15;
		x=2*y+20;//2*y+20->50  ,x=50

		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("==================");
		int a=10;
		a=a+20;//a+20
		System.out.println(a);
		System.out.println("==================");

		int chinese=40;
		chinese+=50;//chinese=chinese+50;
		System.out.println("chinese="+chinese);

		chinese-=30;//chinese=chinese-30;
		System.out.println("chinese="+chinese);

		chinese*=30;//chinese=chinese*30;
		System.out.println("chinese="+chinese);

		chinese/=30;//chinese=chinese/30;
		System.out.println("chinese="+chinese);

		chinese%=8;//chinese=chinese%8;
		System.out.println("chinese="+chinese);


	}
}