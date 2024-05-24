/*
240508 Java Day3 中文測試
javac -encoding utf-8 Ex1.java
*/
class Ex5
{
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("輸入分數");
		int score=sc.nextInt();
		if(score>=91 && score<=100)
		{
			System.out.println("A");
		}
		else if(score>=76 && score<=90)
		{//System.out.println("B");
			if(score>=82)
			{
				System.out.println("B+");
			}
			else
			{
				System.out.println("B-");
			}
		}
		else if(score>=60 && score<=75)
		{
			System.out.println("C");
		}
		else if(score>=0 && score<=59)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("重新輸入 0~100");
		}







		/*
		if(score>=60)
		{
			System.out.println("及格");
			System.out.println("恭喜你");
		}		
		else
		{
			System.out.println("不及格");
			System.out.println("再加油");
		}
		*/

	}
}