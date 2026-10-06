import java.util.Scanner;

public class InputOutput {
    public static int[][] takeinput(){
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
        return arr;
    }

    public static void print(int[][] a){
        int row =a.length;
        int cols=a[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int input[][]=takeinput();
        print(input);
    }
}
