import java.util.Scanner;
public class TripletSum{
    public static void SortedPrint(int a,int b,int c){
        int[] arr={a,b,c};

        for(int i=0;i<2;i++){
            for(int j=0;j<2-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
    }
    public static void check(int[] a,int x) {
        int size = a.length;

        for (int i = 0; i < size -2; i++) {
            for (int j = i + 1; j < size-1; j++) {
                for(int k=j+1;k<size;k++){
                    if (a[i] + a[j] + a[k] ==x) {
                      SortedPrint(a[i],a[j],a[k]);
                    }
                }
            }
        }
    }
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter total numbers = ");
        int n = s.nextInt();
        System.out.print("Enter elements = ");
        int[] arr = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = s.nextInt();
        }
        System.out.print("Enter required sum = ");
        int x=s.nextInt();
        check(arr,x);
    }
}

