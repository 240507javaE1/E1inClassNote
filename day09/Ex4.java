class Ex4
{
	public static void main(String[] args) {
		/*int[] x=new int[3];
		int[] y=new int[3];*/

		//int[][] x=new int[2][3];
		int[][] x=new int[][] { //多維array可以不先訂大小,再拆著寫,比較好讀
			{10,20,74},
			{65,45,65,013,014,015}
		};

		//int[][] x=new int[2][3];
		System.out.println(x);
		System.out.println("\t"+x[0]);
		System.out.println("\t\t"+x[0][0]);
		System.out.println("\t"+x[1]);
		System.out.println("\t\t"+x[1][0]);

		System.out.println("====for check x[i] every time=============");
		//System.out.println(x[0][0].length);
		System.out.println(x);
		for(int i=0;i<x.length;i++)
		{
			System.out.println("\t"+x[i]);
			
			for(int j=0;j<x[i].length;j++)
			{
				System.out.println("\t\t"+x[i][j]);
			}
		}

		System.out.println("======for each===========");
		System.out.println(x);
		int[] y=new int[3];//【新增】一個【整數數列】[先給3個空位]後,塞進【能裝整數數列】的【盒子y】

		for(int[] uuu:x)//"依序"列出int[] uuu= "x裡面的東西"
		{
			System.out.println("\t"+ uuu);//uuu第1圈=x[0],第2圈=x[1],
			for(int abc:uuu)//"依序"列出(int abc= "uuu裡面的東西")
			{
				System.out.println("\t\t"+abc);
			}
		}

	}
}