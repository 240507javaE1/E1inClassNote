class BookStyle1 implements Book { //This Class be subClass of Interface"Book"
//Field
/*
	(public static final) double pi=3.14;
	double pi2=3.12;
*/






//Method,give {body} or abs it in superClass
	public double bookPrice(double price) {
		return price+987.6;
	}

	public void setBookName(String name) {
		System.out.println("/BookStyle1.bookName/ 書名="+name);
	}
}