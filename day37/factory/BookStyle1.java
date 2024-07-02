package pattern;

public class BookStyle1 {
	private Book java;
	private Book photo;
	
	public BookStyle1() {
		super();
		java=new Java();
		photo=new Photoshap();
	}
	
	public BookStyle1(Book java, Book photo) {
		super();
		this.java = java;
		this.photo = photo;
	}
	
	public Book getJava() {
		return java;
	}
	public void setJava(Book java) {
		this.java = java;
	}
	public Book getPhoto() {
		return photo;
	}
	public void setPhoto(Book photo) {
		this.photo = photo;
	}
	
	
	
	
	
	
	
	
	
	
	

}