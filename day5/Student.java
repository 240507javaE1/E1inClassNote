class Student {//參考資料庫-->資料表名(table)
	//field-->欄位-->Column-->參考表
	String name;
	int chi;
	double eng;
	boolean x;

	//constructors
	Student(int chi) { //這邊是local,叫argument引數,意思是等外部輸入chi=?
		//int chi=60;
		this.chi=chi;//this.chi=資料庫field欄位的chi
		System.out.println("新增一位學生"+chi);
	}

	//methods
	void show() {
		System.out.println("姓名:"+name+"\t國文:"+chi+"\t英文:"+eng);
	}
}