public class PriorityQueueByVirtualHeap {

    private static void insertIntoVirtualHeap(int[] arr, int i) {
        int childIndex=i;
        int parentIndex=(childIndex-1)/2;

        while (childIndex>0){
            if(arr[childIndex]>arr[parentIndex]){
                int temp=arr[childIndex];
                arr[childIndex]=arr[parentIndex];
                arr[parentIndex]=temp;

                childIndex=parentIndex;
                parentIndex=(childIndex-1)/2;
            }
            else {
                return;
            }
        }

    }

    private static int removeMaxFromVirtualHeap(int[] arr,int heapSize){
        int temp=arr[0];
        arr[0]=arr[heapSize-1];

        int index=0;
        int rightChildIndex=(2*index)+1;
        int leftChildIndex=(2*index)+2;

        while (leftChildIndex < heapSize){

            int maxIndex=index;
            if(arr[leftChildIndex]>arr[maxIndex]){
                maxIndex=leftChildIndex;
            }
            if(rightChildIndex<heapSize && arr[rightChildIndex]>arr[maxIndex]){
                maxIndex=rightChildIndex;
            }
            if(maxIndex != index){
                int temp1=arr[maxIndex];
                arr[maxIndex]=arr[index];
                arr[index]=temp1;
                index=maxIndex;
                rightChildIndex=(2*index)+1;
                leftChildIndex=(2*index)+2;
            }
            else {
                break;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int arr[]={5,1,9,2,0,6};

        for(int i=0;i<arr.length;i++){
            insertIntoVirtualHeap(arr,i);
        }

        for(int i=0;i< arr.length;i++){
            arr[arr.length-1-i]=removeMaxFromVirtualHeap(arr,arr.length-i);
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


}
