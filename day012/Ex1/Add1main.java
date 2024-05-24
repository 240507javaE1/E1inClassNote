class mainEx1 {
	public static void main(String[] args) {
		A a1=new A();//宣告 A is-a A ,A is-a School
		System.out.println(a1);
		a1.show();
		a1.skillA();

		System.out.println("============================");
		School a2=new A();//is-a school,//實際上a2有a2.skillA,只是被School限制
		System.out.println(a2);
		a2.show();//執行時,實際上這是個A,所以優先拿A.有這名子的東西
		//a2.skillA();
	}
}