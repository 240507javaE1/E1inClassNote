package threadEx;

public class School extends Thread{
	private String name;

	public School(String name) {
		super();
		this.name = name;
	}
	
	public void run()
	{
		show();
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
	
}
