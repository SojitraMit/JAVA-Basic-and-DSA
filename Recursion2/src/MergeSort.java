public class MergeSort {
    public static void mergeSort(int[] input , int sI , int eI){
        if(sI >= eI){
            return;
        }
        int mid=(sI+eI)/2;
        //part 1
        mergeSort(input , sI , mid);
        //part 2
        mergeSort(input , mid+1 , eI);

        merge(input , sI , eI);
    }

    private static void merge(int[] arr, int start, int end) {

        int mid=(start + end)/2;
        int i=start,j=mid+1,k=0;
        int[] temp=new int[end-start+1];

        while(i<=mid && j <=end) {
            if(arr[i] <= arr[j]) {
                temp[k++]=arr[i++];
            }
            else {
                temp[k++]=arr[j++];
            }
        }

        while(i<=mid) {
            temp[k++]=arr[i++];
        }
        while(j<=end) {
            temp[k++]=arr[j++];
        }
        int x=0;
        for(int m=start;m<=end;m++){
            arr[m]=temp[x++];
        }
    }
    public static void main(String[] args){
        int[] arr ={5,4,8,2,9};
        mergeSort(arr , 0 , arr.length-1);
        for(int i=0;i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
