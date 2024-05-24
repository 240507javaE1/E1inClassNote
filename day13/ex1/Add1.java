class Add1
{
	public static void main(String[] args) {
		Company a1=new SA("AAAAAAAAAA",10);//is-a Company
		System.out.println(a1.show());
		System.out.println(a1);
		//((SA)a1).setLcd(20);
		a1.setLcd(20);//super做抽像宣告,super不會建heap
		a1.set(20);
		System.out.println(a1.show());

		System.out.println("=========================================");
		Company b1=new SB("b",7);
		System.out.println(b1.show());
		//((SB)b1).setRam(50);
		//b1.setRam(20);//super做抽像宣告,super不會建heap
		b1.set(50);
		System.out.println(b1.show());

		//Company c=new Company("a");//已抽象化Company,不能new

	}
}