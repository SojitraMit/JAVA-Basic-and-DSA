import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {

    public static int KthLargest(int[] arr,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }

        int cnt=0;
        int ans=0;
        while (cnt!=k){
            ans=pq.remove();
            cnt++;
        }
        return ans;


    }

    public static void main(String[] args) {
        int arr[]={2, 6 ,10, 11 ,13, 4, 1 ,20};
        int k=4;
        System.out.println(KthLargest(arr,k));
    }
}
