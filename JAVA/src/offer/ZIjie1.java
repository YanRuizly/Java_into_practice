package offer;

import java.util.Scanner;

public class ZIjie1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 0 || n> 1024)
            throw new RuntimeException();
        int sum = 1024-n;
        int Counts64 = sum/64;
        sum -= Counts64*64;
        int Counts16 = sum/16;
        sum -= Counts16*16;
        int Counts4 = sum/4;
        sum -= Counts4*4;
        int Counts1 = sum;
        System.out.println(Counts1+Counts4+Counts16+Counts64);
    }
}