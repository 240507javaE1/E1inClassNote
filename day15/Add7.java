/*
lambda-->匿名類別的簡易寫法-->匿名方法
條件
1.搭配 interface
2.只能一個抽象方法
*/
interface Book4 {
	double bookPrice(double price);
}

class Add7 {
	public static void main(String[] args) {
		Book4 b=new Book4() {
			public double bookPrice(double price) {
				return price;
			}
		};
		System.out.println(b.bookPrice(1000));
		Book4 b2=(double price)->price*0.8;//What is this
		System.out.println(b2.bookPrice(1000));
	}
}