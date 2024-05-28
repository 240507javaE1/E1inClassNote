interface Book1
{
	String bookName(String name);
	double bookPrice(double price);

}

class BookStyle1 implements Book1 {
	public String bookName(String name){
		return "書名="+name;
	}
	public double bookPrice(double price){
		return price;
	}
}


class Add3
{
	public static void main(String[] args) {
		//Book1 b1=new Book1();
		Book1 b1=new BookStyle1();
		System.out.println(b1.bookName("java")+"\t價格:"+b1.bookPrice(1000)+"元");
	}
}