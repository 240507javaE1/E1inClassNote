/*
Compiler
1->call by reference-->jdk-->java api ,同一位置
2->call by value
*/
import java.util.Scanner;//用到啥就import啥
import java.util.Date;//用到啥就import啥
//import java.util.*;//不建議這樣improt,未來import多路徑時,同名class會有衝突
class Ex1 {
	public static void main(String[] args) {
		java.lang.Thread t=new java.lang.Thread();//絕對路徑
		Thread t2=new Thread();//相對路徑(java有做預設路徑在java.lang.*)

		java.util.Scanner sc=new java.util.Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		//int x=sc.nextInt();

		Date d=new Date();
		System.out.println(d);


	}
}