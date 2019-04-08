package Interview;

import java.util.Scanner;

public class WangYiT1 {
    public static String revise(char[] strArray) {
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        int i = strArray.length - 1;
        while (i >= 0) {
            if (!Character.isLetterOrDigit(strArray[i])) {
                if (temp.length() != 0) {
                    result.append(temp.toString());
                    temp = new StringBuilder();
                }
                result.append(strArray[i]);
            } else {
                temp.insert(0, strArray[i]);
            }
            i--;
        }
        //尾部的处理
        if(temp.length() != 0){
            result.append(temp.toString());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        char[] strArray = string.toCharArray();
        System.out.println(revise(strArray));
    }
}
