interface Book2 {
	String BookStyle(String name,double price);
}

class Ex2 {
	public static void main(String[] args) {
		Book2 b1=(String name,double price)->"書名:"+name+"\t價格:"+price+"元";
		System.out.println(b1.BookStyle("java",1000));
		System.out.println("=====================================");

		//下面都是同樣意思的簡寫,每生一個就寫個override實作
		Book2 b2=(name,price)->"書名:"+name+"\t價格:"+price+"元";
		Book2 b3=(n,p)->"書名:"+n+"\t價格:"+p+"元";
		//下面是方法內超過1行的寫法
		Book2 b4=(name,price)-> {
			if(price>=0) {
				return "書名:"+name+"\t價格:"+price*0.9+"元";
			} else {
				return "價格需>=0";
			}
		};
		System.out.println(b4.BookStyle("java",-1000));
		System.out.println("=====================================");
		System.out.println(b4);






	}
}