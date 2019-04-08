package offer;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        if(q < 1 || q > 100000)
            return;
        //第i个数字为 i * (-1)^i
        for(int i=1 ; i <= q; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(l < 1 || l > 1000000000 || r < 1 || r > 1000000000 || l > r)
                return;
            int distence = 0;
            int sum = 0;
            distence = r - l;
            if((l & 1) == 0 && (r & 1) == 0){
                sum = (distence/2)*(-1) + r;
            }
            if((l & 1) == 0 && (r & 1) == 1){
                sum = (distence/2 + 1)*(-1);
            }
            if((l & 1) == 1 && (r & 1) == 0){
                sum = (distence/2 + 1)*1;
            }
            if((l & 1) == 1 && (r & 1) == 1){
                sum = (distence/2) + (-1)* r;
            }
            System.out.println(sum);
        }
    }
}
