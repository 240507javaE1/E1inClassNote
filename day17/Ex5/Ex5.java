enum Book {//so, it is a "class Book", with auto array which inside
//Obj auto array of Book, once Book calls, its will new them first			
	Java11(300,10),//Java11+()-->Book Java11=new Book();
	JavaWeb(650,5),//JavaWeb+()-->Book JavaWeb=new Book();
	Spring(700,6);//Spring+()-->Book Spring=new Book();
//Field of Book,
	private int price;
	private int amount;
//Constructor of Book, seems auto (private)
	private Book(int price,int amount) {
		this.price=price;
		this.amount=amount;
	}
//get-er/set-er of Book,
	public int getPrice() {
		return price;
	}
	public int getAmount() {
		return amount;
	}
//Methods,
	public String show() {
		return "\t價格:"+getPrice()+"\t數量:"+getAmount();
	}
}
//so uh, it really new 3 Book objects, 
//and .value() will list them in array Book[]
//Since Book has its Field/C/Method
//they 3 Books will has Field/C/Method inside

class Ex5 {
	public static void main(String[] args) {
		System.out.println(Book.Java11);
		System.out.println("=====================================\n");
		

		Book[] b=Book.values(); //array them, care b is a Book[]
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		System.out.println("=====================================\n");




		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]+"\t價格:"+b[i].getPrice()+"\t數量:"+b[i].getAmount());
		}
		System.out.println("=====================================\n");
		

		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+b[i].show());
		}




	}
}