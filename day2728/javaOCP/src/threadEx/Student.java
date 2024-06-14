package threadEx;

public class Student extends School2 implements Runnable{
	
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}
	
	public void show()
	{
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(500);
				System.out.println("名="+name);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

	@Override
	public void run() {
		show();
		
	}

}