package LeetCode.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode39 {
    /*
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        combinationSum(candidates,target,0,lists,new ArrayList<>());
        return lists;
    }

    public static void combinationSum(int[] candidates, int target, int start, List<List<Integer>> lists,List<Integer> list) {
        if(target == 0){
            lists.add(new ArrayList<>(list));
            //return;
        }else {
            for (int i=start;i<candidates.length;i++){
                if(candidates[i] <= target){
                    list.add(candidates[i]);
                    combinationSum(candidates,target-candidates[i],start,lists,list);
                    list.remove(list.size()-1);
                }
            }
        }
    }
    */
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> listAll=new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<Integer>();
        //排序
        Arrays.sort(candidates);
        find(listAll,list,candidates,target,0);
        return listAll;
    }
    public static void find(List<List<Integer>> listAll,List<Integer> tmp,int[] candidates, int target,int num){
        //递归的终点
        if(target==0){
            listAll.add(tmp);
            return;
        }
      //  if(target<candidates[0]) return;
        for(int i=num;i<candidates.length&&candidates[i]<=target;i++){
            //深拷贝
            List<Integer> list=new ArrayList<>(tmp);
            list.add(candidates[i]);
            //递归运算，将i传递至下一次运算是为了避免结果重复。
            find(listAll,list,candidates,target-candidates[i],i);
        }
    }




    public static void main(String[] args){
        List<List<Integer>> lists = combinationSum(new int[]{2,3,6,7},7);
        System.out.println(lists);
    }
}
