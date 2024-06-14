package threadEx;

public class Ex1 {

	public static void main(String[] args) {
		School s=new School("a");
		s.show();
		
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(250);
				System.out.println("i="+i+"\thello java");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
