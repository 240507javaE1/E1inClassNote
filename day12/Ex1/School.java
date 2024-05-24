class School {
//method
	
	//void show() {
	//	System.out.println("callout a school.show");
	//}
	
	String show() {
		return "callout a school.show";
	}
//method當sub的索引,做空method的話,被稱為抽象化?,
	void skillA(){}//運用override機制在super做subA專屬的method
	//就可以call A in School時的A專屬method,必要時也能 super.專屬動作,大概吧

}