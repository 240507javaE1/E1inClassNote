/*
240508 Java Day3 中文測試
javac -encoding utf-8 Ex1.java
*/
class Ex1
{
	public static void main(String[] args)
	{
		int chi=65;
		int eng=75;

		System.out.println(chi>=60 && eng>=80);//(TT->T ,TF->F)
		System.out.println(chi>=60 & eng>=80);//T->1 ,F->0--->1 & 0->0-->F
		System.out.println(chi>=60 || eng>=80);
		System.out.println(chi>=60 | eng>=80);

		//System.out.println(5&&2);
		System.out.println(5&2);
		System.out.println(5|2);
		System.out.println(5^7);

		System.out.println(5);
		System.out.println(~5);
		System.out.println(~(-4));
		System.out.println(5>2);
		System.out.println(5>>2);
		System.out.println(5<<2);
	}
}

