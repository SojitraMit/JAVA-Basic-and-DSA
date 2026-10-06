import java.util.Scanner;

public class MatrixOpretion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter first array ");
        int[][] arr1=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr1[i][j]=s.nextInt();
            }
        }

        System.out.println("enter second array ");
        int[][] arr2=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr2[i][j]=s.nextInt();
            }
        }

        System.out.println("Enter opretion");
        char c=s.next().charAt(0);


        int[][] ans=new int[3][3];
        switch (c){
            case '+':

                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        ans[i][j]=arr1[i][j]+arr2[i][j];
                    }
                }
                break;
            case '-':
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        ans[i][j]=arr1[i][j]-arr2[i][j];
                    }
                }
                break;
            case '*':
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        for (int k = 0; k < 3; k++) {
                            ans[i][j] = ans[i][j] + arr1[i][k] * arr2[k][j];
                        }
                    }
                }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }


    }
}
