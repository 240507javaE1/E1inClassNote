class Ex1//Array 的【新增】方式,Array是個Class(跟String一樣)
{
	public static void main(String[] args) {
		//int x=123;

		//int[] x=new int[3];//【新增】一個【整數數列】[先給3個空位]後,塞進【能裝整數數列】的【盒子x】
		int[] x=new int[]{10,20,30,30,40,85,74,95};
		//Integer[]  x=new Integer[3]; //class的陣列,新增成功後,沒給值的話,預設是null
		//double[]  x=new double[3];
		//boolean[]  x=new boolean[3];
		//String[]  x=new String[3];
		//Double[] x=new Double[3];
		//Boolean[] x=new Boolean[3];
		//Float[] x=new Float[3];





		//System.out.println(x);//這個x指的是記憶體的位置(地址)
		System.out.println(x+"\t陣列個數:"+x.length);
		for(int i=0;i<3;i++)
		{
			System.out.println(x[i]);
		}
		//================================================
		System.out.println("==============");
		System.out.println(x);
		for(int o:x)//做一個盒子o,用指標(冒號)從位置x,"列舉後面的int"(塞[0]後,塞[1]蓋掉[0],塞[2]蓋掉[1])
		{
			System.out.println(o);
		}
		//=======================================================
		System.out.println("==============");
		System.out.println(x);
		for(int o:x) {
		//for(double o:x)//double 物件<---> = new Double();-->AutounBoxing
		//for(Boolean o:x) {
			System.out.println(o);
		}
		
	}
}