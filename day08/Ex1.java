class Ex1 {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);	//【新增】一個【Scanner】(鍵盤)
		System.out.println("輸入國文:");			//螢幕印出"輸入國文:"
		String chi=sc.next();					//sc.next()吐字串,塞進字串盒Chi
		System.out.println("輸入英文:");			//螢幕印出"輸入國文:"
		String eng=sc.next();					//sc.next()吐字串,塞進字串盒Chi
		System.out.println("總分="+(chi+eng));	//字串12+字串87=字串相連1287
		System.out.println("=================");
		//class new一個大Integer
		Integer C=new Integer(chi);//【新增】一個【Integer】(給字串) //【Integer這東西】會幫我【字串轉Int】
		Integer E=new Integer(eng);//【新增】一個【Integer】(給字串) //【Integer這東西】會幫我【字串轉Int】
		System.out.println("總分="+(C+E));//Integer被當成int,可以相加
		System.out.println("=================");

		//Integer的parseInt()是static共用的
		System.out.println("總分:"+(Integer.parseInt(chi)+Integer.parseInt(eng)));//Integer能用,因為現在字典API位置在java.lang裡
		System.out.println(Math.PI);//能用Math是因為,現在字典API位置在java.lang裡
		System.out.println(Math.abs(-8.5));
		System.out.println(Math.pow(10.123,3.569));
	}
}