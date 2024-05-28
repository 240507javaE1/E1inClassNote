class Company {
	void show1() {
		System.out.println("new skill1");
	}
	void show2() {
		System.out.println("new skill2");
	}
}


class Ex1 {
	public static void main(String[] args) {
		/*Company c=new Company();		
		System.out.println(c);
		c.show1();*/

		//System.out.println(new Company());
		//new Company().show1();

		//System.out.println(new Company());//.show1();
		//System.out.println(new Company());//show2();

		//new Company().show1();
		Company c=new Company();
		c.show1();
		c.show2();
	}
}