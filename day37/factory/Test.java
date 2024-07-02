package pattern;

public class Test {

	public static void main(String[] args) {
		BookStyle1 b=new BookStyle1();
		int x=2;
		Book bs=null;
		if(x==1)
		{
			bs=b.getJava();
		}
		else if(x==2)
		{
			bs=b.getPhoto();
		}
		else 
		{
			bs=BookStyle2.getLinux();
		}
		
		
		System.out.println(bs.bookStyle());
		

	}

}