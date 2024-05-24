class Add2_Member
{
	public static void main(String[] args) {
		Member[][] m=new Member[2][];
		m[0]=new Member[2];
		//m[1]=new Member[3];

		//把Member給null
		m[0][0]=new Member("a1","台北");
		m[0][1]=new Member("a2","台北");
/*
		m[1][0]=new Member("b1","台北");
		m[1][1]=new Member("b2","台北");
		m[1][2]=new Member("b3","台北");
		//把Member給null*/

		/*
		System.out.println(m);
		for(int i=0;i<m.length;i++)
		{
			System.out.println("\t"+m[i]);
			for(int j=0;j<m[i].length;j++)
			{
				System.out.println("\t\t"+m[i][j]);
			}
		}
		*/
		System.out.println("==========================");
		System.out.println(m);
		for(Member[] o:m)
		{
			System.out.println("\t"+o);
			for(Member u:o)	{//javac給過,但null塞不進menber所以null exception
				System.out.println("\t\t"+u);
			}
		}




		//自我練習=========================
		System.out.println("=============");
		//int i=null;//javac出錯,不給編譯
		//System.out.println(i);
		//Member[][] mMm=new Member[][];
		//System.out.println(mMm);
		//Member[] mMmM=new Member[];
		//System.out.println(mMmM);
		//Member mMmMMMM=new Member();
		//System.out.println(mMmMMMM);
	}
}