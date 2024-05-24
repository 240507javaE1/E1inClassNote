interface Book {//auto (public) abstract class Book
//Field,=>auto (public static final)
	public static final double pi=3.14;
	double pi2=3.12; //interface=auto (public static final)
//Constructors  //砍了,不給new
	//Book(){}
//Methods,=>auto (public abstract)
	public abstract void setBookName(String name);
	double bookPrice(double price);
	




	//void show(){} //java 8up can has {body}
	default void skill_1() {//java 8以後-->物件類--->直接繼承給子類別-->需透過子類別物件呼叫
		System.out.println("default java skill_1");
	};

	static void skill_2() {//java 8以後-->類別類--->沒有繼承給子類別-->只能透過介面呼叫
		System.out.println("static java skill_2");
	};
}