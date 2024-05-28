class Add1_Member {
	public static void main(String[] args) {
		Member[]  m=new Member[3];//m[0],m[1],m[2]-->名子/標籤
		m[0]=new Member("a","taipei");
		m[1]=new Member("b","台北");
		m[2]=new Member("c","台中");

		System.out.println(m);
		System.out.println(m[0]+"\t"+m[0].show());
		System.out.println(m[1]);
		System.out.println(m[2]);
		System.out.println("==for(i的規定) {每圈檢查現在的i=?}==(重點在i)===========");
		System.out.println(m);
		for(int i=0;i<m.length;i++)	{
			System.out.println("\t"+m[i]+"\t"+m[i].show());
		}
		System.out.println("==for(盒子oOo=m,【列舉】m裡的東西==(【列舉】=從頭到尾)===========");
		System.out.println(m);
		for(Member oOo:m)
		{
			System.out.println("\t"+oOo+"\t"+oOo.show());
		}





		/*
		Member m=new Member("a","台北");
		Member AAA=new Member("b","台北");
		Member uuu=new Member("a","台北");

		System.out.println(m+"\t"+m.show());
		System.out.println(AAA+"\t"+AAA.show());
		System.out.println(uuu+"\t"+uuu.show());
		*/
	}
}