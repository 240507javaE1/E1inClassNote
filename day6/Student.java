class Student { //參考資料庫-->資料表名(table)
	//field欄位,學生打從一開始就該有的東西
	private String name;//建議一開始就用private鎖住資料
	private int chi;
	private int eng;
	private int sum;

	//constructors "新增"時一定要做的事
	Student(String name,int chi,int eng) { //這邊是local區域,()內又稱為argument引數,意思是等外部輸入chi=?
		if(chi>=0 && eng>=0) {
			this.name=name;	//this.name=資料庫field欄位的name
			this.chi=chi;	//this.chi=資料庫field欄位的chi
			this.eng=eng;	//this.eng=資料庫field欄位的eng
			//sum=chi+eng;	//內部沒有宣告sum的話,會找到外面的sum,比較不好看的寫法
			this.sum=this.chi+this.eng; 	//可讀性高的寫法,邏輯也比較正確
			System.out.println("【new新增一位學生】的名子與成績已被填入");
		} else {
			System.out.println("【new新增一位學生】國文或英文有負數不給填,只維持預設值");
		}	
	}

	//methods //另外可以讓這學生做的事,(沒有一定要做)
	void setName(String name) {	//因為priv鎖資料不給改,所以用method改name
	 this.name=name; 			//set東西-->做完事就好,不用回傳-->用void
	}
	String getName() {
		return this.name; 		//return field欄位的name
	}
	void setChi(int chi) {		//set東西-->做完事就好,不用回傳-->用void
		if(chi>=0) {
			this.chi=chi;
			sum=chi+eng;		//改完chi即時更新sum
		} else {
			System.out.println("成績不要給負值!");
		}
	}
	int getChi() {				//return field欄位的chi
		return chi;
	}

	void show() {
		System.out.println("姓名:"+name+
			"\t國文:"+chi+
			"\t英文:"+eng+
			"\t總分:"+sum);
	}
	void change1(int chi,int eng) {
		this.chi=chi;	//this.chi=資料庫field欄位的chi
		this.eng=eng;	//this.eng=資料庫field欄位的eng
		this.sum=this.chi+this.eng; 	//可讀性高的寫法,邏輯也比較正確
	}

	int change2(int chi,int eng) {
		this.chi=chi;	//this.chi=資料庫field欄位的chi
		this.eng=eng;	//this.eng=資料庫field欄位的eng
		this.sum=this.chi+this.eng; 	//可讀性高的寫法,邏輯也比較正確
		return this.sum; //int change2(int chi,int eng)=return後面的東西
	}
}