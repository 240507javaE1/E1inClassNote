class AddFutureMoney
{
	public static void main(String[] args) {
		System.out.println(FutureMoney.calculate(10,20));	//有static共用可在【new新增前】先用
		System.out.println(FutureMoney.title());			//有static共用可在【new新增前】先用
		//FutureMoney.capital=200000;//被鎖capital不能直接改	//有static共用可在【new新增前】先用
		FutureMoney.setCapital(10000);//資料表名稱.共用的東西	//有static共用可在【new新增前】先用
		
		FutureMoney f1=new FutureMoney(0.014,2);//【新增】一個【FutureMoney】(先給利率,期數),塞進【能裝FutureMoney】盒子f1
		FutureMoney f2=new FutureMoney(0.013,3);//【新增】一個【FutureMoney】(先給利率,期數),塞進【能裝FutureMoney】盒子f1
		FutureMoney f3=new FutureMoney(0.012,4);//【新增】一個【FutureMoney】(先給利率,期數),塞進【能裝FutureMoney】盒子f1
		FutureMoney f4=new FutureMoney(0.011,5);//【新增】一個【FutureMoney】(先給利率,期數),塞進【能裝FutureMoney】盒子f1

		f1.show();
		f2.show();
		f3.show();
		f4.show();

		System.out.println("==================");
		//FutureMoney.capital=5000; //被鎖capital不能直接改 //static共用中,【資料表名稱.共用的東西】
		//f2.rate=0.0115;

		//System.out.println(f1.title());
		f1.show();
		f2.show();
		f3.show();
		f4.show();

	}
}