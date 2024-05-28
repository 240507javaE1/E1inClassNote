interface Book3
{
	String bookName(String name);
	double bookPrice(double price);
}

class Add5
{
	public static void main(String[] args) {
		
		System.out.println("合計="+(
				new Book3()	{
					public String bookName(String name) {
						return null;
					}

					public double bookPrice(double price) {
						return price*0.95;
					}
				}.bookPrice(1000)
				+
				new Book3()	{
					public String bookName(String name) {
						return null;
					}
					public double bookPrice(double price) {
						return price*0.85;
					}
				}.bookPrice(1000)+"元")
		);

	}
}