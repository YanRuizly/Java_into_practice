package offer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Deque<Integer>> list = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        if(n < 1 || n > 100000)
            return;
        if(m < 1 || m > 1000000000)
            return;
        if(m <= n) {
            System.out.println(1);
            return;
        }
//        if(n == 1){
//            System.out.println(m/n);
//            return;
//        }
        for(long i =2;i<=1000000000 ;i++){
            if( (i-1)*n <= m  && m <= i*n){
                System.out.println(i);
                return;
            }
        }
    }
}