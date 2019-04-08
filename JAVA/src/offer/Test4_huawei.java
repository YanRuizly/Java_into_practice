package offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test4_huawei {
    public static  void main(String[] args){
       // Scanner scanner = new Scanner(System.in);
       // int n = scanner.nextInt();
      //  System.out.println(n);
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("241");
        list.add("5131");
     //   Object[] array=list.toArray();
        String[] array=list.toArray(new String[list.size()]);
        System.out.println(array.toString());
    }
}
