package offer;

import java.util.Scanner;
import java.util.Stack;

public class Zijie2 {
    public static Stack<Character> ModifyThree(char[] strArray){ //默认长度>=3
        Stack<Character> stack = new Stack<>();
        stack.push(strArray[0]);
        int counts =1;
        for(int i=1;i<=strArray.length-1;i++){
           if(stack.peek() != strArray[i]) {
               stack.push(strArray[i]);
               counts =1;
           }
           else {
               counts += 1;
               if(counts > 2) //不让进了
                   continue;
               else
                   stack.push(strArray[i]);
           }
        }
        return stack;
    }

    public static String ModifyThree2(char[] strArray) { //默认长度>=3
        int counts =0;
        for(int i=0;i<=strArray.length-1-1-1;i++){
            if(strArray[i] == strArray[i+1] && strArray[i+1] == strArray[i+2]){
                counts++;
                for(int j=i+1;j<=strArray.length-2;j++){
                    strArray[j] = strArray[j+1];
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<strArray.length-counts;i++)
            stringBuilder.append(strArray[i]);
        return stringBuilder.toString();
    }

    public static String ModifyDouble2(String string){ //默认长度>=3
        char[] strArray = string.toCharArray();
        int counts =0;
        for(int i=0;i<=strArray.length-1-1-1-1;i++){
            if(strArray[i] == strArray[i+1] && strArray[i+2] == strArray[i+3]){
                counts++;
                for(int j=i+2;j<=strArray.length-2;j++){
                    strArray[j] = strArray[j+1];
                }
            }

        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<strArray.length-counts;i++)
            stringBuilder.append(strArray[i]);
        return stringBuilder.toString();
    }


    public static String ModifyDouble(Stack<Character> stack){ //默认长度>=3
        char[] strArray = new char[stack.size()];
        int i=stack.size()-1;
        while (!stack.isEmpty()) {
            strArray[i] = stack.pop();
            i--;
        }
        int counts =0;
        for(i=0;i<=strArray.length-1-1-1-1;i++){
            if(strArray[i] == strArray[i+1] && strArray[i+2] == strArray[i+3]){
                counts++;
                for(int j=i+2;j<=strArray.length-2;j++){
                    strArray[j] = strArray[j+1];
                }
            }

        }
        StringBuilder stringBuilder = new StringBuilder();
        for(i=0;i<strArray.length-counts;i++)
            stringBuilder.append(strArray[i]);
        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            String str = sc.next();
            char[] strArray = str.toCharArray();
            Stack<Character> stack  = ModifyThree(strArray);
            String stringx = ModifyThree2(strArray);
            //System.out.println(stringx);
            String string = ModifyDouble2(stringx);
            System.out.println(string);
        }
    }
}
