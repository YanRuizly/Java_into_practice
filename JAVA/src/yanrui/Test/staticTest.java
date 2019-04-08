package yanrui.Test;

class A{
    private static String a  = "123";
}


public class staticTest extends A{


    public static void main(String[] args){
        final String s1 = "123";
        String s2 = "123";
        int i = 1;
        String s3 = new String("123");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        char c = 'A';
        c = (char)(c + 1);
        System.out.println(c);
    }
}
