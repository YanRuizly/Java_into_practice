package Sort;

import java.util.Arrays;

public class QuickSort2 {
    public void QuickSort(int[] arrays,int i,int j){
        if(i < j) {
            int part = Partition(arrays, i, j);

            QuickSort(arrays,i,part-1);
            QuickSort(arrays,part+1,j);
        }
    }

    public int Partition(int[] arrays,int i,int j){
        int start = i;
        int end = j;
        int temp = arrays[start];
        while (start < end){
            while (start < end && arrays[end] >= temp){
                end--;
            }
            arrays[start]  = arrays[end];
            while (start < end && arrays[start] <= temp){
                start++;
            }
            arrays[end] = arrays[start];
        }
        arrays[start] = temp;
        return start;
    }

    public void quickSort2(int[]arr,int n) {
        __quickSort2(arr,0,n-1);
    }

    private void __quickSort2(int[] arr, int l, int r) {
        if(l>=r)
            return;
        int p=Media(arr,l,r);
        __quickSort2(arr, l, p-1);
        __quickSort2(arr, p+1, r);
    }

    private int Media(int[] arr, int l, int r) {
        //double类型，产生一个l到r的随机数作为数组基准值下标
        //将随机数与数组第一个数交换，即让随机数作为基准值
        //减小近乎有序的概率
        swap(arr, l, (int)Math.random()*(r-l+1)+l);
        int v=arr[l];
        int j=l;
        for(int i=l+1;i<=r;i++) {
            if(arr[i]<v) {
                swap(arr,i,j+1);
                j++;
            }
        }
        swap(arr,l,j);
        return j;
    }

    public void swap(int[] arrays,int i,int j){
        int temp = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = temp;
    }

    public static void test1(int[] arrays){
        QuickSort2 quickSort = new QuickSort2();
        quickSort.QuickSort(arrays,0,arrays.length-1);
    }

    public static void test2(int[] arrays){
        QuickSort2 quickSort = new QuickSort2();
        quickSort.quickSort2(arrays,arrays.length);
    }

    public static void main(String[] args){
        int[] arrays = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        long startTime = System.nanoTime();    //获取开始时间
        test1(arrays);
        long endTime = System.nanoTime();    //获取结束时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ns");    //输出程序运行时间
        System.out.println(Arrays.toString(arrays));

        int[] arrays_2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        startTime = System.nanoTime();    //获取开始时间
        test2(arrays_2);
         endTime = System.nanoTime();    //获取结束时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ns");    //输出程序运行时间
        System.out.println(Arrays.toString(arrays_2));
    }
}
