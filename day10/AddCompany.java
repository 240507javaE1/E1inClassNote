class AddCompany { //執行這Add3的是玩弄這些資料表的人   可以用SA,SB跟他們的上級Company
	public static void main(String[] args) {
		
		Company c1=new Company("公司Boss","台中");
		System.out.println("===============================");
		SA s1=new SA("teacher",5);//is-a SA , is-a Company
		System.out.println("===============================");
		SB s2=new SB("aa","台中",50);


		System.out.println("===============================");
		System.out.println("名:"+s1.name+ "\t地址:"+s1.address+ "\tlcd:"+s1.lcd);
	}
}