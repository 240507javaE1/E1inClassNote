import java.util.InputMismatchException;
class Exam1
{
	public static void main(String[] args) {
		//int x;
		//System.out.println(x);
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int[] x=new int[3];
		System.out.println("請輸入索引碼");
		
		try {
			int n=sc.nextInt();
			x[n]=100;//new ArrayIndexOutOfBoundsException();中斷 拋訊號
			System.out.println("x["+n+"]="+x[n]);
			System.out.println("=====================================\n");
			
			System.out.println("請輸入分母");
			int m=sc.nextInt();
			System.out.println("x["+n+"]/"+m+"="+(x[n]/m)+"\n");
			System.out.println("=====================================\n");
		} catch(ArrayIndexOutOfBoundsException
				|InputMismatchException
				|ArithmeticException e) {
			System.out.println("Array超出/只能整數/除0問題發生, 請重新輸入, 0~2");
			e.printStackTrace();
		/*
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException, Array超出, 重新輸入, 0~2");
			e.printStackTrace();
		} catch(InputMismatchException e) {
			System.out.println("InputMismatchException,請輸入整數, 別輸入不是整數的東西");
			System.out.println("==以下為原版錯誤訊息=====");
			e.printStackTrace();
			System.out.println("==以上為原版錯誤訊息=======");
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException，分母不可為0");
			System.out.println("==以下為原版錯誤訊息=======");
			e.printStackTrace();
			System.out.println("==以上為原版錯誤訊息=======");
		*/
		} catch(Exception e) {
			System.out.println("重新輸入 , 0/1/2");
			System.out.println("==以下為原版錯誤訊息=======");
			e.printStackTrace();
			System.out.println("==以上為原版錯誤訊息=======");
		}/* finally {
			for(int i=1;i<=10;i++) {
				System.out.println("hello java");
			}
		}*/
		for(int i=1;i<=10;i++) { //java 7以後compiler會幫你偷加finally
				System.out.println("hello java");
			}



	}
}