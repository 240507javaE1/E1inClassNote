package pattern;

public class BookStyle2 {
	
	public static Book getJava()
	{
			
		return new Java();
	}
	
	public static Book getLinux()
	{
		return new Linux();
	}

}