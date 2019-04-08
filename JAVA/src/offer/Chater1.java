package offer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Chater1 {
    final static String xxx = "1241";
    public static void test1(){
        Integer i = new Integer(100);
        Integer j = new Integer(100);
        int m = 100;
        System.out.println(i==j);   //比较对象地址
        System.out.println(i==m);
        System.out.println(i.equals(j));
        System.out.println();
        String x = new String("100");
        String y = new String("100");
        String z = "100";
        System.out.println(x==y);   //比较对象的地址
        String w = "100";
        System.out.println("zw");
        System.out.println(x.equals(y));
        System.out.println(z==w);
        System.out.println(z==x);
        System.out.println(x.equals(z));
        String n = String.valueOf(100);
        System.out.println(x==n);
        System.out.println(z==n);
        System.out.println(x.equals(n));
        StringBuilder s1 = new StringBuilder("123");
        StringBuilder s2 = new StringBuilder("123");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }

    public static void test2(){
        int[] array = {1,3,4,9,2,0,4,5,3,9,6};
        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        for(int i=0;i<array.length;i++)
            treeSet.add(array[i]);
        System.out.println(treeSet);
    }

    public static void main(String[] args){
     //   test1();
        test2();
    }
}
