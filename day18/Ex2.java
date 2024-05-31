class Book<E> {
	String name;
	E price;
//Constructor,
	Book(String name,E price) {
		this.name=name;
		this.price=price;
		System.out.println("名:"+name+"\t價格:"+price);
	}
//Method,
	void show() {
		System.out.println("名:"+name+"\t價格:"+price);
	}
}


class Ex2 {
	public static void main(String[] args) {
		Book<Integer> b=new Book<Integer>("aa",1000);
		b.show();
		b.price=1000.5;



		/*Book b=new Book("java",1000);
		b.show();
		b.price=1000.5;
		b.show();*/



	}
}