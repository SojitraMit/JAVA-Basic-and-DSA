import java.util.Scanner;

public class SpiralPrint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of row = ");
        int m = s.nextInt();
        System.out.print("Enter number of colum = ");
        int n = s.nextInt();
        int[][] arr = new int[m][n];

        System.out.println("Enter elements of " + m + " row and " + n + " colum 2d-array : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        //spiral printing
        int minr = 0;
        int maxr = m-1;
        int minc = 0;
        int maxc = n-1;
        int tnum = m*n;
        int count=0;

        while(count<tnum){
            for(int j=minc ; j<=maxc ; j++){
                System.out.print(arr[minr][j]+" ");
                count++;
            }
            minr++;
            if(count>=tnum) break;

            for(int i=minr ; i<=maxr ; i++){
                System.out.print(arr[i][maxc]+" ");
                count++;
            }
            maxc--;
            if(count>=tnum) break;

            for(int j=maxc ; j>=minc ; j--){
                System.out.print(arr[maxr][j]+" ");
                count++;
            }
            maxr--;
            if(count>=tnum) break;

            for(int i=maxr ; i>=minr ; i--){
                System.out.print(arr[i][minc]+" ");
                count++;
            }
            minc++;
        }
    }
}
