class mainEx1 {
	public static void main(String[] args) {
		A a=new A();//宣告 A is-a A ,A is-a School
		a.show();
		a.skillA();

		System.out.println("==========");
		School a2=new A();//is-a school
		a2.show();
		a2.skillA();
	}
}