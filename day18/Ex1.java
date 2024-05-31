class Ex1 {
	public static void main(String[] args) throws Exception {
		Student[] s=new Student[] {
			
				new Student("a1",-78,90), //--->Exception;
			










				new Student("a2",58,90),
				new Student("a3",78,50)
			};

			
			for(int i=0;i<s.length;i++) {
				s[i].show();
			}
			System.out.println("======================\n");
			s[0].setChi(85);

			System.out.println("===try modify Eng==============\n");
			s[0].setEng(-87);

			for(int i=0;i<s.length;i++) {
				s[i].show();
			}
			/*
			java.util.Scanner sc=new java.util.Scanner(System.in);
			System.out.println("請輸入修改英文的數字");
			int eng=sc.nextInt();
*/
			//assert need use java -ea Ex1
			//assert eng>=0:"修改英文的分數需>=0";
			//s[0].setEng(eng);


			/*
			for(int i=0;i<s.length;i++) {
				s[i].show();
			}
			*/

			

















		/*
		try {
			Student[] s=new Student[] {
				new Student("a1",78,90),
				new Student("a2",58,90),
				new Student("a3",78,50)
			};
			for(int i=0;i<s.length;i++) {
				s[i].show();
			}
			System.out.println("=================");
			s[0].setChi(-85);
			for(int i=0;i<s.length;i++)	{
				s[i].show();
			}
		} catch(Exception e) {
			System.out.println("main新增國文與英文需>=0");
			System.out.println("==以下是java提供的錯誤訊息=====");
			e.printStackTrace();
			System.out.println("==以上是java提供的錯誤訊息=====");
		}
		*/



	}
}