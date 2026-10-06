import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter row");
        int n=s.nextInt();
        System.out.println("Enter colum");
        int m=s.nextInt();

        int arr[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=s.nextInt();
            }
        }

        int min=Integer.MAX_VALUE;
        int r=-1;
        int c=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                    r=i;
                    c=j;
                }
            }
        }

        System.out.println("min="+min+" row="+r+" colum="+c);
    }
}
