class Ex1
{
	public static void main(String[] args) {
		Book b;//=> Book b=new Book();					b.pi
		Book b1=null;//=Book b1;=> Book b1=new Book();	b1.pi
		Book b2=null;	//								b2.pi
		System.out.println(Book.pi);
		System.out.println(Book.pi2);

		//Book.pi2=65.2;
		System.out.println("===============");
/*
		//沒講開幾格,但列舉在{}內
		Book[] book=new Book[] {
			new BookStyle1(),
			new BookStyle2()
		};
		System.out.println(book[0]);
		System.out.println(book[1]);
*/

		System.out.println("===============");//{null,null}
		Book[] book=new Book[2]; //先講開2格盒子,那2格可以放Book(有關的東西), 下2行一個個new
		book[0]=new BookStyle1();//=>{BookStyle1,null}
		book[1]=new BookStyle2();//=>{BookStyle1, BookStyle2}
		System.out.println(book[0]);
		System.out.println(book[1]);




		System.out.println("===============");
		book[0].setBookName("java.11工具書");
		System.out.println("價格:"+book[0].bookPrice(1000));


		System.out.println("==物件類方法=============");
		book[0].skill_1();//default在Book會繼承下去=會下放
		book[1].skill_1();//物件類方法,會繼承下去=會下放

		//book[0].skill2();
		System.out.println("==類別類方法=============");
		Book.skill_2();//static在Book不會繼承=不會下放
						//類別類方法
	}
}