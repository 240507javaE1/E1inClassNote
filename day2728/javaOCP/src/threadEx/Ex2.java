package threadEx;

public class Ex2 {

	public static void main(String[] args) throws InterruptedException {
		School s1=new School("a");
		School s2=new School("b");
		School s3=new School("c");
		School s4=new School("d");
		
		s1.start();
		s2.start();
		s2.join();
		s3.start();
		s4.start();
	}

}
