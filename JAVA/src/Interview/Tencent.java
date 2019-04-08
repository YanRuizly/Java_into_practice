package Interview;


import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

// 序列中，找不到一个和为s的最小输入值
public class Tencent {
    public static void main(String[] args){
        int[] S = {1,4,3,2,5};
        Arrays.sort(S);
        for (int i : S){
            System.out.println(i);
        }// 1 2 3 4 5
        int sum = 0;
        for (int i = S[0] ;i< Integer.MAX_VALUE;i++){
            Deque<Integer> deque = new LinkedList<>();
            sum = i;
            int temp =0;
            for(int j=0;j<S.length;j++){
                deque.addLast(S[j]);
                temp = temp + S[j];  //当前和
                while(temp > sum){ //当前和比sum大
                    deque.removeFirst();
                }
                if(temp == sum){//找到相等的
                   break;
                }
            }

        }
    }
}
