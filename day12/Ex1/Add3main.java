class Add3main
{
	public static void main(String[] args) {
		School[] s=new School[] {
			new A(),
			new B(),
			new C()
		};

		System.out.println(s[0]);
		System.out.println(s[0] instanceof School);
		System.out.println(s[0] instanceof A);
		System.out.println(s[0] instanceof B);
		System.out.println(s[0] instanceof C);

		
		/*
		for(School o:s) {
			System.out.println(o.show());
		}
		System.out.println(s[0].equals(s[1]));

		System.out.println("==============");
		s[0]=s[1];
		for(School o:s) {
			System.out.println(o+"\t"+o.show());
		}
		
		System.out.println(s[0].equals(s[1]));
		
		System.out.println("==============");
		System.out.println(s[2]);
		*/

	}
}