class Add2main {
	public static void main(String[] args) {
		School[][] s=new School[3][];
		s[0]=new School[3];
		s[1]=new School[4];
		s[2]=new School[5];


		s[0][0]=new A();
		s[0][1]=new A();
		s[0][2]=new A();

		s[1][0]=new B();
		s[1][1]=new B();
		s[1][2]=new B();
		s[1][3]=new B();

		s[2][0]=new C();
		s[2][1]=new C();
		s[2][2]=new C();
		s[2][3]=new C();
		s[2][4]=new C();


		System.out.println(s);
		for(int i=0;i<s.length;i++) {
			System.out.println("\t"+s[i]);
			for(int j=0;j<s[i].length;j++) {
				System.out.println("\t\t"+s[i][j]+"\t"+s[i][j].show());
			}
		}

		//((A)s[0][0]).skillA();

		s[0][0].skillA();
		s[0][1].skillA();
		s[0][2].skillA();


		System.out.println("=============================");
		System.out.println(s);
		for(School[] o:s) {
			System.out.println("\t"+o);
			for(School u:o) {
				System.out.println("\t\t"+u);
			}
		}

			
		
	}
}