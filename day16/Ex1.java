interface Book1 {
	double bookPrice(double price);
	//String bookName(String name);
}

class Ex1
{
	public static void main(String[] args) {
		Book1 b1=new Book1() { //{body} override to interface
			public double bookPrice(double price) {
				return price*0.9;
			}
			public String bookName(String name)	{
				return null;
			}
		};
		System.out.println("價格:"+b1.bookPrice(1000));
		System.out.println("=====================================");

		Book1 b2=(double price)->price*0.85;
		//lamda方法=new一個Interface{只有一個方法(args)}->(return) args*0.85
		System.out.println("價格:"+b2.bookPrice(1000));
		System.out.println("=====================================");
		//下面都是同樣意思的簡寫,每生一個就寫個override實作
		Book1 b3=(price)->price*0.8;
		Book1 b4=price->price*0.8;
		Book1 b5=p->p*0.95;
		//下面是方法內超過1行的寫法
		Book1 b6=price->{
			if(price>=0) {
				return price*0.8;
			} else {
				return 0;
			}
		};

		System.out.println("價格:"+b6.bookPrice(1000));
	}
}