enum Product//product[]  ?=new product[]{Lcd,Ram,Mouse}
{// seems only a String array 1D
	Lcd,Ram,Mouse;	
}

class Ex3
{
	public static void main(String[] args) {
		System.out.println(Product.Lcd);
		System.out.println("=====================================");

		//enum seems has a implicit method (public static) Product.values()
		Product[] p=Product.values();//new product[]{Lcd,Ram,Mouse}
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i]);
		}
	}
}