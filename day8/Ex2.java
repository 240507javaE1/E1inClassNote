class Ex2
{
	public static void main(String[] args) {
		//Array 的【新增】方式,Array是個Class(跟String一樣)
		int    x=123;

		int[]  x=new int[3];//【新增】一個【整數數列】[先給3個空位]後,塞進【能裝整數數列】的【盒子x】
		IIIII  x=new IIIII();
		Student x=new Student("tony",60,75); 








		System.out.println(x);//這個x指的是記憶體的位置(地址)
		System.out.println("==============");
		System.out.println(x[0]);//
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println("==============");
			//class的陣列,新增成功後,沒給值的話,預設是null
		//Integer[]  x=new Integer[3];
		//double[]  x=new double[3];
		//boolean[]  x=new boolean[3];
		//String[]  x=new String[3];
		//Double[] x=new Double[3];
		//Boolean[] x=new Boolean[3];
		//Float[] x=new Float[3];

		for(int i=0;i<3;i++)
		{
			System.out.println(x[i]);
		}

		System.out.println("==============");
		System.out.println(x);
		for(int o:x)//做一個盒子o,用指標(冒號)從位置x,"列舉後面的int"(塞[0]後,塞[1]蓋掉[0],塞[2]蓋掉[1])
		{
			System.out.println(o);
		}
		

		/*int abc=10;
		int def=20;
		int ddd=30;

		System.out.println(abc);
		System.out.println(def);
		System.out.println(ddd);*/
	}
}