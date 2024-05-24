class test
{
	public static void main(String[] args) 
	{	java.util.Scanner sc=new java.util.Scanner(System.in);//生一個鍵盤出來
		/*
	 	boolean result;
     	int i=1;
     	result= 1   ==   2 &    ++      i   >=   2;
    	System.out.println("result="+result+",i="+i);
    	*/
/*
    	int x=1, y=1;
       //boolean b=++x>++y;//x=x+1;y=y+1;x>y
       //boolean b=++x>y++;//x=x+1;x>y;y=y+1
       // boolean b=x++>++y;//y=y+1;x>y;x=x+1
		
       boolean b=x++  >   y;//x>y;x=x+1;y=y+1;
       System.out.println(b);
       System.out.println(x);
       System.out.println(y);
		System.out.println("=======================");
*/

/*

        int x=0;
	 int y=0;
	 do{
	 y++;
	 ++x;
	 System.out.println(x+","+y);
	 }while(x<5);
	 System.out.println(x+","+y);
	 */

		int x=1,y=2,a=1,b=1,m=3,n=1;
		x=y+=m++;
		a=10*b++;
		n=m+ ++n;
		String s="ka"+n+"jdfl";
		//m=++n
		System.out.println(a);
		System.out.println(b);
       	System.out.println(x);
      	System.out.println(y);
       	System.out.println(m);
       	System.out.println(n);
       	System.out.println(s);

       	System.out.println("輸入字串");         //寫點說明，叫使用者做啥
		String inpuString=sc.next();                  //把使用者的"字串"存起來
		System.out.println(inpuString);


	}
}