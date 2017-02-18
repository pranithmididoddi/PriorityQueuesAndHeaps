import java.util.*;

/**
 * Created by Pranith on 2/18/17.
 */
public class Solution {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        queue.offer(7);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
            System.out.println(queue.peek());
        }
    }

    public int thirdMax(int[] nums) {
        Set<Integer> set=new HashSet<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int n : nums){
            if(set.add(n)){
                pq.offer(n);
            }

            if(pq.size()>3){
                pq.poll();
            }
        }
        if(pq.size()==2) pq.poll();

        return pq.peek();

    }
}
