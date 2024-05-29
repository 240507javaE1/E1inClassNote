class Company2 {//product[]  ?=new product[]{Lcd,Ram,Mouse}
	enum Product {Lcd, Ram, Mouse;}
	enum Week {星期一, 星期二, 星期三;}
	enum Month {一月, 二月, 三月;}
}
class Ex4
{
	public static void main(String[] args) {
		Company2.Product[] p=Company2.Product.values();//p=new product[]{Lcd,Ram,Mouse}
		Company2.Week[] w=Company2.Week.values();
		Company2.Month[] m=Company2.Month.values();

		for(int i=0;i<3;i++)
		{
			System.out.println(p[i]+"\t"+w[i]+"\t"+m[i]);
		}
	}
}