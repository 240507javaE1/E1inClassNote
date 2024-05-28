class FutureMoney{//【class資料表】名稱FutureMoney
	//field欄位,打從一開始就該有的東西(private能鎖,static共用)
	private static int capital; 	//本金(static共用中)
	private double rate;		//利率
	private int nTime;		//期數
	private double total;	//本利和(單利)

	//constructor 	//【new新增】時(一定要先做的事)
	//本金是共用的,一直重新設定很多餘,放到外面改就好
	//FutureMoney(int capital(多餘,砍掉),double rate,int nTime){
	FutureMoney(double rate,int nTime){
		//this.capital=capital;	//砍掉後就沒有用到了
		this.rate=rate;
		this.nTime=nTime;
		this.total=capital*(1+rate*nTime);
	}

	//method的set-er/get-er //用來拿鎖住的field欄位,沒事不要static
	/*static*/ void setRate(double rate) { 
		if(rate>=0) {
			this.rate=rate;//this.rate是【我這個的rate】,static(共用)跟this(我這個)會衝突到
		}
	}
	static void setCapital(int capital) {//static共用中	//只有共用的field欄位才能static
		if(capital>=0) {
			FutureMoney.capital=capital;//field欄位capital被【資料表FutureMoney共用】了,所以用【資料表名稱FutureMoney.capital】
		}
	}

	//method功能,自由設計		//跟field欄位的變數無關的東西,可以static共用
	static String title() { //static共用中	//宣告String,會吐String
		return "本金:"+ "\t利率:"+ "\t期數:"+ "\t本利和:";
	}
	static int calculate(int x,int y) { //static共用中	//宣告int,會吐int
		return x*y;//跟field欄位的rate/nTime/total無關,可以static共用
	}

	void show() { //宣告void,不會吐東西,做完就消失void
		this.total=capital*(1+rate*nTime);//有rate/nTime/total,所以不能static共用
		System.out.println("本金:"+capital+ "\t利率:"+rate+ "\t期數:"+nTime+ "本利和:"+total);
	}
}