class BookStyle2 implements Book { // 可new
	//mehtod
	public double bookPrice(double price) {
		return price*0.95;
	}
	public void setBookName(String name) {
		System.out.println("/Bsty1.bN/java書名="+name);
	}
}