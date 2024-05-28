class Order {//參考資料庫-->資料表名(table)
	//field-->欄位-->Column-->參考表
	String name;
	int ruler;
	int pen;
	int sum;

	//constructors
	Order(){}
	Order(String name,int ruler,int pen) {
		if(ruler>=0 && pen>=0) {
			this.name=name;
			this.ruler=ruler;
			this.pen=pen;
			//this.sum=this.ruler*29+this.pen*34; //不用這樣做
			sum=ruler*29+pen*34;
		} else {
			System.out.println("尺與筆數量需>=0");
		}
	}

	Order(int ruler,int pen) {
		if(ruler>=0 && pen>=0) {
			this.ruler=ruler;
			this.pen=pen;
			//this.sum=this.ruler*29+this.pen*34; //不用這樣做
			sum=ruler*29+pen*34;
		} else {
			System.out.println("尺與筆數量需>=0");
		}
	}

	Order(String name,int ruler){}
	Order(int ruler,String name){}
	//Order(int x,int y) {}

	//methods
	void show() {
		System.out.println("名:"+name+
			"\t尺:"+ruler+
			"\t筆:"+pen+
			"\t金額:"+sum);
	}
}