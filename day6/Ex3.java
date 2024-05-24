class Ex3 {
	public static void main(String[] args) {
		//primitive type-->一般變數
		System.out.println("=======primitive type=============");
		double d1=10.12;
		System.out.println(d1+100);

		Double d2=10.12;
		System.out.println(d2+100);


		String x="45.12";
		//double s1=(double)x;

		Double s2=new Double(x);

		System.out.println(s2+100);
	}
}