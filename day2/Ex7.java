/*
240508 Java Day2 中文測試
javac -encoding utf-8 Ex1.java
*/
class Ex7
{
	public static void main(String[] args)
	{
		int chinese=65;
		int testValue=65;

		System.out.println("chinese>60--->"+(chinese>testValue));
		System.out.println("chinese<60--->"+(chinese<testValue));
		System.out.println("chinese>=60--->"+(chinese>=testValue));
		System.out.println("chinese<=60--->"+(chinese<=testValue));
		System.out.println("chinese==60--->"+(chinese==testValue));
		System.out.println("chinese!=60--->"+(chinese!=testValue));
		System.out.println("====================");

		chinese=65;
		int english=80;

		System.out.println("chinese>=60 && english>=80--->"+!(chinese>=60 && english>=80));
		System.out.println("chinese>=60 || english>=80--->"+(chinese>=60 || english>=80));
		System.out.println("chinese>=60 ^ english>=80--->"+(!(chinese>=60) ^ english>=80));
		/*
		byte z=123;
		byte v=!z;
		System.out.println(z);
		System.out.println(v);
		*/

	}
}