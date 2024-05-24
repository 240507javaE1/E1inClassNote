/*
240508 Java Day3 中文測試
javac -encoding utf-8 Ex1.java
*/
class Ex6
{
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("輸入分數");
		int score=sc.nextInt();
		System.out.println(score>=60? "及格":"不及格");
		/*
		if(score>=60)
		{

		}
		*/
	}
}