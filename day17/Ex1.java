interface Book1 {
	String bookStyle(String name,double price);
}
class Ex1 {
	public static void main(String[] args) {
		Book1 b1=(name,price)-> {
			if(price>=0) {
				return "書名="+name+"\t價格="+price;
			} else {
				return "需price>=0";
			}
		};
		System.out.println(b1.bookStyle("java",1000));
		System.out.println("=====================================");
		System.out.println(b1);

		System.out.println("=================================");
		Book1 b2=Cal::p2;//impletment p2 of Cal to override Book1's only method, bookStytle()
						//which called b2, so we can just use b2's only method bookStytle(), 
						//then b2.bookStytle will impletment as Cal.p2
		System.out.println(b2.bookStyle("java11",1000));
	


	}
}


class Cal {//撰寫要實作的抽象法的內容
	public static String p1(String name,double price) {
		if(price>=0) {
			return "書名="+name+"\t價格="+price*0.95;
		} else {
			return "需price>=0";
		}
	}

	public static String p2(String name,double price) {
		if(price>=0) {
			return "書名="+name+"\t價格="+price*0.9;
		} else {
			return "需price>=0";
		}
	}


	public static String p3(String name,double price) {
		if(price>=0) {
			return "書名="+name+"\t價格="+price*0.85;
		} else {
			return "需price>=0";
		}
	}