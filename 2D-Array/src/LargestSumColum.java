import java.util.Scanner;

public class LargestSumColum {
    public static int[][] takeinput(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of row = ");
        int m=s.nextInt();
        System.out.print("Enter number of colum = ");
        int n=s.nextInt();
        int[][] input =new int[m][n];

        System.out.println("Enter elements of "+m+" row and "+n+" colum 2d-array : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                input[i][j]=s.nextInt();
            }
        }
        return input;
    }

    public static int largestnum(int input[][]){
        int row =input.length;
        int cols=input[0].length;
        int largest=Integer.MIN_VALUE;

        for(int j=0;j<cols;j++){
            int sum=0;
            for(int i=0;i<row;i++){
                sum = sum + input[i][j];
            }
            if(largest<sum){
                largest=sum;
            }
        }
        return largest;
    }

    public static void main(String[] args){
        int arr[][]=takeinput();
        int ans=largestnum(arr);
        System.out.print("largest colum sum = "+ans);
    }
}
