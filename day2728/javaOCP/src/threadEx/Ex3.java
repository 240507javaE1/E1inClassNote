package threadEx;

public class Ex3 {

	public static void main(String[] args) {
		Student s1=new Student("a");
		Student s2=new Student("b");
		Student s3=new Student("c");
		
		Thread t1=new Thread(s1);//boxing
		Thread t2=new Thread(s2);
		Thread t3=new Thread(s3);
		
		t1.start();
		t2.start();
		t3.start();


	}

}
