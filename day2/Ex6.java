/*
240508 Java Day2 中文測試
javac -encoding utf-8 Ex1.java
*/
/*

*/
class Ex6
{
	public static void main(String[] args)
	{
		int x=10;
		//x=x+1;
		//x+=1;
		//x++;
		++x;
		System.out.println("x="+x);
		//x=x-1;
		//x-=1;
		//x--;
		--x;
		System.out.println("x="+x);
		System.out.println("============");

		int a=10;
		int b;
		int c;
		//a++;
		//++a;
		b=a++;//先b=a;再a=a+1;
		//b=++a;//先a=a+1;再b=a;
		c=50*a++;

		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}
}