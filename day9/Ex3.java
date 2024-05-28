class Ex3//筆記中:x是標籤還是盒子?
{
	public static void main(String[] args) {
		int[] x=new int[]{10,20,30};
		//System.out.println(x+"\t"+x[0]+"\t"+x[1]+"\t"+x[2]+"\t"+x[3]);
		System.out.println(x);
		x=new int[10];
		x[3]=300;
		x[4]=50;
		System.out.println(x);

		System.out.println(x[3]+"\t"+x[4]);

		for(int i=0;i<x.length;i++)
		{
			System.out.println("x["+i+"]="+x[i]);
		}




	}
}