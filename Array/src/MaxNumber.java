import java.util.Scanner;

public class MaxNumber {
    public static int largest(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++)
            if (arr[i] > max) {
                max = arr[i];
            }
        return max;
    }
    public static int[] input(){
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }

    public static void print(int arr[]){
        int size=arr.length;
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[]=input();
        print(arr);
        int largest=largest(arr);
        System.out.print("largest "+largest);
    }
}
