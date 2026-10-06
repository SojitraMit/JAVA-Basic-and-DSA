public class CheckSorted {
//    public static boolean check(int input[]){
//        if(input.length <=1){
//            return true;
//        }
//        int smallinput[]=new int[input.length-1];
//        for(int i=1;i<input.length;i++){
//            smallinput[i-1]=input[i];
//        }
//
//        boolean smallAns=check(smallinput);
//        if(!smallAns){
//            return false;
//        }
//        if(input[0]<=input[1]){
//            return true;
//        }
//        else{
//            return false;
//        }
//
//    }



//    public static boolean check(int input[]){
//        if(input.length <=1){
//            return true;
//        }
//        if(input[0] > input[1]){
//            return false;
//        }
//
//        int smallinput[]=new int[input.length-1];
//        for(int i=1;i<input.length;i++){
//            smallinput[i-1]=input[i];
//        }
//
//        boolean smallAns=check(smallinput);
//        return smallAns;
////        if(!smallAns){
////            return false;
////        }
////        else{
////            return true;
////        }
//
//    }

    private static boolean check(int arr[],int startIdx){
        if(startIdx == arr.length-1){
            return true;
        }
        if(arr[startIdx]>arr[startIdx+1]){
            return false;
        }

        boolean smallAns=check(arr,startIdx+1);
        return smallAns;
    }
    public static boolean check(int arr[]){
        return check(arr,0);
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,7,9};
        boolean ans=check(arr);
        System.out.print(ans);
    }
}
