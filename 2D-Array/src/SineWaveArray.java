import java.util.Scanner;

public class SineWaveArray {

    public static void printSineWave(int[][] arr, int N, int M) {
        for (int col = 0; col < M; col++) {
            if (col % 2 == 0) {
                // Print top to bottom for even indexed columns
                for (int row = 0; row < N; row++) {
                    System.out.print(arr[row][col] + " ");
                }
            } else {
                // Print bottom to top for odd indexed columns
                for (int row = N - 1; row >= 0; row--) {
                    System.out.print(arr[row][col] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter total test cases : ");
        int t = s.nextInt();

        for (int test = 0; test < t; test++) {
            System.out.print("Enter total row numbers : ");
            int N = s.nextInt();
            System.out.print("Enter total colum numbers : ");
            int M = s.nextInt();
            int[][] arr = new int[N][M];

            System.out.println("Enter elements of "+N+" row and "+M+" colum 2d-array : ");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    arr[i][j] = s.nextInt();
                }
            }

            printSineWave(arr, N, M);
            System.out.println();
        }

        s.close();
    }
}

