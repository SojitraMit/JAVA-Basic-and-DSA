import java.lang.ref.Cleaner;

public class CheckMaxHeap {

    public static boolean check(int[] arr){

        for(int i=0;i<arr.length;i++) {
            int parentIndex = i;
            int leftChildIndex = (2*i)+1;
            int rightChildIndex = (2*i)+2;

            if(leftChildIndex<arr.length && arr[leftChildIndex]>arr[parentIndex]){
                return false;
            }
            if(rightChildIndex<arr.length && arr[rightChildIndex]>arr[parentIndex]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[]={43,40,42,20,25,19,30};
        System.out.println(check(arr));

    }
}
