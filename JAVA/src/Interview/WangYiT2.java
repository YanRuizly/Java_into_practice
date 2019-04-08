package Interview;

import java.util.Scanner;

public class WangYiT2 {
    public static void revise(char[] array,int start,int end){
        while (start < end){
            swap(array,start,end);
            start++;
            end--;
        }
    }

    public static void swap(char[] array,int i,int j){
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        char[] array = string.toCharArray();
        revise(array,0,array.length-1);
        int len = string.length();
        int start = 0;
        int end = 0;
        for(int i=0;i<len;i++){
//            if(array[i] != ' '){
//                if((array[i] >= 'a' && array[i] <= 'z') || (array[i] >= 'A' && array[i] <= 'Z') || array[i] == '-' || array[i] == '\''){//标点符号
//                }else {
//                    start++;
//               //     end--;
//                }
//            }
            if(array[i] == '.' || array[i] == ','){
                start++;
            }
            if(array[i] == ' '){
                end = i-1;
                revise(array,start,end);
                start = i+1;
            }
            if(i == len -1){
                revise(array,end+2,i);
            }
        }
        //最后的处理
        System.out.println(array);
        // Zhuo Guaqiang, spokesman for the State-owned avivation, which is head in beijing, said that sub
        //Radio and television are very popular in the world today. Millions of people watch TV. Perhaps more people listen to the radio.
    }
}
