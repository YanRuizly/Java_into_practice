package yanrui.DataStructure.Collection.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>(10);
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(10,new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });
    int count = 0;
    //往大顶堆插入小的值    小顶堆插入大的值   那么中间数字就是  小顶堆的（最大） 和大顶堆的（最小）
    public void Insert(Integer num) {
        if(((minHeap.size()+maxHeap.size())&1)==0){//偶数时,下个数字加入小顶堆
            if(!maxHeap.isEmpty() && maxHeap.peek()>num){
                maxHeap.offer(num);
                num=maxHeap.poll();
            }
            minHeap.offer(num);
        }else{//奇数时，下一个数字放入大顶堆
            if(!minHeap.isEmpty() && minHeap.peek()<num){
                minHeap.offer(num);
                num=minHeap.poll();
            }
            maxHeap.offer(num);
        }
    }

}
