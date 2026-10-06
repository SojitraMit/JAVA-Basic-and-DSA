import java.util.Scanner;

public class LargestRowOrColum {
    public static void largest(int[][] arr){
        int row=arr.length;
        int colum=arr[0].length;

        int rowidx=-1;
        int maxrow=Integer.MIN_VALUE;
        for(int i=0;i<row;i++){
            int rowsum=0;
            for(int j=0;j<colum;j++){
                rowsum= rowsum +arr[i][j];
            }
            if(maxrow<rowsum){
                maxrow=rowsum;
                rowidx=i;
            }
        }

        int columidx=-1;
        int maxcolum=Integer.MIN_VALUE;
        for(int i=0;i<colum;i++){
            int columsum=0;
            for(int j=0;j<row;j++){
                columsum= columsum +arr[j][i];
            }
            if(maxcolum<columsum){
                maxcolum=columsum;
                columidx=i;
            }
        }

        if(maxrow>=maxcolum){
            System.out.println("Largest Row index = "+rowidx+" and sum = "+maxrow);
        }
        if(maxrow<=maxcolum){
            System.out.print("Largest Colum index = "+columidx+" and sum = "+maxcolum);
        }
    }

    public static void main(String[] args){
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
        largest(input);
    }
}
