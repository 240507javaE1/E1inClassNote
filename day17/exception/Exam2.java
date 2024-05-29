import java.io.IOException;
import java.io.File;
class Exam2
{
	public static void main(String[] args) {
		File f=new File("c:/a.txt");
		//f.createNewFile();
		try {
			f.createNewFile();
		}
		catch(IOException e) {
			System.out.println("無新增檔案權限");
		}
	}
}