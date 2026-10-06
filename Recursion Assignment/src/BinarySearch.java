public class BinarySearch {
    public static int search(int[] arr,int num){
        return search(arr,0,arr.length-1,num);
    }
    public static int search(int[] arr,int start,int end,int num){
        if(start>end){
            return -1;
        }
        int mid=(start+end)/2;
        if(arr[mid]==num){
            return mid;
        }
        else if(arr[mid]>num){
            return search(arr,start,mid-1,num);
        }
        else {
            return search(arr,mid+1,end,num);
        }
    }
    public  static void main(String[] args){
        int arr[]={2,3,4,5,6};
        int num=6;
        int idx=search(arr,num);
        System.out.print(idx);
    }
}
