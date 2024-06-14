package threadEx;

public class Bus extends Thread{
	private static int sum;
	
	
	
	
	
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			try {
				Thread.sleep(200);
				add(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	
	public synchronized static void add(int pay)//每一筆錢收入+計算加總
	{
		int tmp=sum;//b1
		System.out.println("目前總金額="+tmp);//b1
		System.out.println("收到一筆錢="+pay+"元");//b1
		tmp=tmp+pay;//b1
		System.out.println("目前最新總金額="+tmp+"元");//b1
		sum=tmp;//b1
		System.out.println("");//b1
	}
	
	

}