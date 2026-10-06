import java.util.PriorityQueue;

public class Problems {

    public static void sortKSorted(int[] arr,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        int i=0;
        for(;i<k;i++){
            pq.add(arr[i]);
        }
        for(;i<arr.length;i++){
            arr[i-k]=pq.remove();
            pq.add(arr[i]);
        }
        for(int j=arr.length-k;j< arr.length;j++){
            arr[j]=pq.remove();
        }
    }

    public static void printKLargest(int[] arr,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        int i=0;
        for(;i<k;i++){
            pq.add(arr[i]);
        }
        for(;i<arr.length;i++){
            int min=pq.element();
            if(min<arr[i]){
                pq.remove();
                pq.add(arr[i]);
            }
        }

        while (!pq.isEmpty()){
            System.out.print(pq.remove()+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={20,4,1,9,6,8};

        int k=3;
//        sortKSorted(arr,k);
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
        printKLargest(arr,k);
    }
}
