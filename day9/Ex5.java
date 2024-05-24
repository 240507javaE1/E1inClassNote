class Ex5
{
	public static void main(String[] args) {
		int[][][] x=new int[2][2][3];
		System.out.println(x);
		System.out.println(x[0]);
		System.out.println(x[0][0]);
		System.out.println(x[0][0][0]);
	
		System.out.println("==for(i的規定) {check x[i] every time}===================");
		System.out.println(x);
		for(int i=0;i<x.length;i++)
		{
			System.out.println("\t"+x[i]);
			for(int j=0;j<x[i].length;j++)
			{
				System.out.println("\t\t"+x[i][j]);
				for(int k=0;k<x[i][j].length;k++)
				{
					System.out.println("\t\t\t"+x[i][j][k]);
				}
			}
		}
		System.out.println("==for(盒子ooo=x,【列舉】x裡的東西(從頭到尾)===================");//
		System.out.println(x);
		for(int[][] ooo:x)
		{
			System.out.println("\t"+ooo);
			for(int[] uuuuu:ooo)
			{
				System.out.println("\t\t"+uuuuu);
				for(int vvvv:uuuuu)
				{
					System.out.println("\t\t\t"+vvvv);
				}
			}
		}
	}
}