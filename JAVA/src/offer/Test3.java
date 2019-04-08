package offer;

import java.util.LinkedList;
import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList< LinkedList<Integer>> lists = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();
        int n = sc.nextInt();
        int s = sc.nextInt();
        if (n < 1 || n > 2000 || s < 0 || s > 2000)
            return;
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();  //每张卡片
            if (x < 0 || x > 2)  //石头0、布1、2剪刀
                return;
            list.add(x);
        }

//        int times = 1;
//        for (int i=1;i<=n-s;i++){
//            times = times*3;
//        }
//        System.out.println(times);
//        int num = 0;
//        int multn = 1;
//        int mults = 1;
//        for(int i = 1; i <=s ;i++){
//            multn = multn*n;
//            n = n-1;
//        }
//        System.out.println(multn);
//        for(int i = 1; i <=s ;i++){
//            mults = mults*s;
//            s = s-1;
//        }
        //一共可以选择的方案有 3^n种
        //如果得了s分，那么代表总共有n张牌中有s张的位置是确定的
        //另外n-s可以不定,就是3^(n-s)种
        for(int i = 1;i<=n;i++){  //一个n个数
            LinkedList<Integer> temp = new LinkedList<>();
            for (int j=0;j<=2;j++){
                temp.add(j);
            }
            lists.add(temp);
        }
        System.out.println(lists);
        for (LinkedList<Integer> temps : lists){
            System.out.println(temps);
        }
        for (int i : list){
            System.out.println(i);
        }
    }
}
