import java.util.Scanner;

public class RowSum {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of row = ");
        int m=s.nextInt();
        System.out.print("Enter number of colum = ");
        int n=s.nextInt();
        int[][] arr =new int[m][n];

        System.out.println("Enter elements of "+m+" row and "+n+" colum 2d-array : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=s.nextInt();
            }
        }

        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum = sum + arr[i][j];
            }
            System.out.println("row number "+i+" sum = "+sum);
        }
    }
}
