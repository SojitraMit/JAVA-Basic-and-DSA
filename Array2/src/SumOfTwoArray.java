import java.util.Scanner;

public class SumOfTwoArray {
    public static int[] sum(int[] a, int[] b) {
        int size1 = a.length;
        int num1=0;

        for (int i = 0; i < size1; i++) {
            num1=(num1*10)+a[i];
        }

        int size2=b.length;
        int num2=0;
        for (int j = 0; j < size2; j++) {
            num2 = (num2 * 10) + b[j];
        }
        int sum=num1+num2;
        int size3 = 0;
        int p=sum;
        while(p>0){
            size3++;
            p/=10;
        }

        int[] ans=new int[size3];
        for(int k=0;k<size3;k++){
            int ld=sum%10;
            ans[size3-k-1]=ld;
            sum/=10;
        }
        return ans;
    }

    public static void print(int[] a){
        int size=a.length;

        System.out.println("Sum of array :");
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter cases = ");
        int t = s.nextInt();

        for (int i = 1; i <= t; i++) {
            System.out.print("Enter total numbers for arr1 = ");
            int n = s.nextInt();
            System.out.print("Enter elements for arr1 = ");
            int[] arr1 = new int[n];
            for (int j = 0; j < n; j++) {
                arr1[j] = s.nextInt();
            }
            System.out.print("Enter total numbers  for arr2 = ");
            int m = s.nextInt();
            System.out.print("Enter elements for arr2 = ");
            int[] arr2 = new int[m];
            for (int j = 0; j < m; j++) {
                arr2[j] = s.nextInt();
            }
            int ans[]=sum(arr1 , arr2);
            print(ans);
        }
    }
}