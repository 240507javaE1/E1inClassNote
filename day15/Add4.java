interface Book2
{
	String bookName(String name);
	double bookPrice(double price);
}

class Add4
{
	public static void main(String[] args) {
		Book2 b1=new Book2()
		{
			public double bookPrice(double price)
			{
				return price*0.95;
			}

			public String bookName(String name)
			{
				return "java 書名="+name;
			}
		};	//等同class ? implements Book2  {}
		//目的之一是為了main buffer結束後全方法都會被清空
		//所以沒有真正的XX.java=>XX.class給其他人利用

		System.out.println(b1.bookName("java")+"\t價格:"+b1.bookPrice(1000)+"元");
	}
}