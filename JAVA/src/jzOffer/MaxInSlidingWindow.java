package jzOffer;

//题目：给定一个数组和滑动窗口的大小，请找出所有滑动窗口里的最大值。例如，
//如果输入数组{2, 3, 4, 2, 6, 2, 5, 1}及滑动窗口的大小3，那么一共存在6个
//滑动窗口，它们的最大值分别为{4, 4, 6, 6, 6, 5}，

import java.util.ArrayDeque;
import java.util.ArrayList;

public class MaxInSlidingWindow {
    public ArrayList<Integer> maxInWindows(int [] num, int size){
        ArrayList<Integer> max = new ArrayList<Integer>();
        if(num==null || num.length<=0 || size<=0 || size>num.length)
            return max;
        ArrayDeque<Integer> indexDeque = new ArrayDeque<Integer>();

        for(int i=0;i<size-1;i++){
            while(!indexDeque.isEmpty() && num[i]> num[indexDeque.getLast()])
                indexDeque.removeLast();
            indexDeque.addLast(i);
        }

        for(int i=size-1;i<num.length;i++){
            while(!indexDeque.isEmpty() && num[i]> num[indexDeque.getLast()])
                indexDeque.removeLast();
            if(!indexDeque.isEmpty() && (i-indexDeque.getFirst())>=size)
                indexDeque.removeFirst();
            indexDeque.addLast(i);
            max.add(num[indexDeque.getFirst()]);
        }

        return max;
    }
}