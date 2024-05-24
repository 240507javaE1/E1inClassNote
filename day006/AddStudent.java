class AddStudent
{
	public static void main(String[] args) {
		Student s1=new Student("a",65,74);	//【新增】一個【學生】(先把該做的事做完),放進一個【能裝學生】的【盒子s1】
		Student s2=new Student("b",55,74);	//【新增】一個【學生】(先把該做的事做完),放進一個【能裝學生】的【盒子s2】
		s1.show();
		s2.show();
		System.out.println("=====================");
		s1.change1(70,70);
		s2.change1(85,90);
		System.out.println("合計="+(s1.change2(70,70)+s2.change2(85,90)));
		s1.show();
		s2.show();
		//void x=s1.change(70,70);
		//System.out.println(x);

		//s1.chi=-50;
		s1.setChi(-50); //叫s1做這件事
		System.out.println("國文="+s1.getChi());
		s1.show();	//叫s1做這件事
	}
}