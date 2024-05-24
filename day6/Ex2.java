class Ex2
{
	public static void main(String[] args) {
		//primitive type-->一般變數
		System.out.println("=======primitive type=============");
		double d1=10.12;
		double d2=10.12;
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println(d1==d2);

		System.out.println("=========wrapper class===========");
		//Double D1=10.12;//java 5 以後的寫法,稱為AutoBoxing
		//Double D2=10.12;
		java.lang.Double D1=new java.lang.Double(10.12);//java 4以前的寫法,稱為Boxing
		java.lang.Double D2=new java.lang.Double(10.12);//新增一筆資料
		java.lang.Double D3=D2;
		System.out.println("D1="+D1);
		System.out.println("D2="+D2);
		System.out.println(D1==D2);
		System.out.println(D3==D2);
		System.out.println(D1.equals(D2));
		System.out.println(D3.equals(D2));
	}
}