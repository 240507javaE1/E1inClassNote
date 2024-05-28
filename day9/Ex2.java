class Ex2
{
	public static void main(String[] args) {
		
		int[] x=new int[]{10,20,30};
		int[] y=new int[]{40,50,60};


		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("x[0]="+x[0]);
		System.out.println("y[0]="+y[0]);
		System.out.println("=====================");
		//x=y;//位址=位址-->x,y同一位址 stack-->被消滅-->自動回收-->garbage collection(GC)
		x[0]=y[0];//值=值-->copy

		System.out.println("x[0]="+x[0]);
		System.out.println("y[0]="+y[0]);
		System.out.println("=====================");
		System.out.println("x="+x);
		System.out.println("y="+y);
		x[0]=100;
		System.out.println("x[0]="+x[0]);
		System.out.println("y[0]="+y[0]);
		x=null;//清掉x的記憶體位置的分配
		System.out.println("x="+x);
//自我練習=========================================================		
		System.out.println("=====================");
		String x2=new String();
		System.out.println("x2="+x2);
		System.out.println(x2.getClass().getName());
		Integer[]  x3=new Integer[3]; //class的陣列,新增成功後,沒給值的話,預設是null
		System.out.println(x3);
		System.out.println(x3[0]);
		x3[0]=12.3;//x3標籤一直都在,x3會記得只能裝Integer
		System.out.println(x3[0]);
//自我練習=========================================================
		System.out.println("=====================");
		int z = 123;
		//System.out.println(typeof(z));
		System.out.println(Integer.TYPE.isInstance(5)); /* int */
		System.out.println(Integer.class.isInstance(5)); /* int */
		int i = 20;
		float f = 20.2f;
		System.out.println(((Object)i).getClass().getName());
		System.out.println(((Object)f).getClass().getName());

//自我練習==============================================================
		/*
		int x=10;
		int y=20;

		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("=====================");
		x=y;

		System.out.println("x="+x);
		System.out.println("y="+y);

		System.out.println("=====================");
		x=100;

		System.out.println("x="+x);
		System.out.println("y="+y);
		*/

	}
}