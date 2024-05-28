public class Test {
    public static void main(String args[]) {
        String Str1 = new String("runoob");
        String Str2 = Str1;
        String Str3 = new String("runoob");
        boolean retVal;

        retVal = Str1.equals( "runoob" );
        System.out.println("返回值 = " + retVal );

        retVal = Str1.equals( Str3 );
        System.out.println("返回值 = " + retVal );
    }
}