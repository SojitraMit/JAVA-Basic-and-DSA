public class minCostPath {

    public static int minCost(int[][] arr){
        return minCost(arr,0,0);
    }

    private static int minCost(int[][] arr, int i, int j) {
        int m=arr.length;
        int n=arr[0].length;

        if(i==m-1 && j==n-1){
            return arr[i][j];
        }

        if(i>=m || j>=n){
            return Integer.MAX_VALUE;
        }

        int opn1=minCost(arr,i,j+1);
        int opn2=minCost(arr,i+1,j+1);
        int opn3=minCost(arr,i+1,j);

        return arr[i][j] + Math.min(opn1,Math.min(opn2,opn3));
    }

    public static int minCostM(int[][] arr){
        int[][] storage=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                storage[i][j]=-1;
            }
        }
        return minCostM(arr,0,0,storage);
    }

    private static int minCostM(int[][] arr, int i, int j,int[][] storage) {
        int m=arr.length;
        int n=arr[0].length;

        if(i>=m || j>=n){
            return Integer.MAX_VALUE;
        }

        if(i==m-1 && j==n-1){
            storage[i][j]=arr[i][j];
            return storage[i][j];
        }

        if(storage[i][j]!= -1){
            return storage[i][j];
        }

        int opn1=minCostM(arr,i,j+1,storage);
        int opn2=minCostM(arr,i+1,j+1,storage);
        int opn3=minCostM(arr,i+1,j,storage);

        storage[i][j]=arr[i][j] + Math.min(opn1,Math.min(opn2,opn3));
        return storage[i][j];
    }

    public static int minPathDP(int[][] arr){
        int m=arr.length;
        int n=arr[0].length;
        int[][] storage=new int[m][n];

        storage[m-1][n-1]=arr[m-1][n-1];

        //last row
        for(int i=n-2;i>=0;i--){
            storage[m-1][i]=arr[m-1][i]+storage[m-1][i+1];
        }

        //last colum
        for(int j=m-2;j>=0;j--){
            storage[j][n-1]=arr[j][n-1]+storage[j+1][n-1];
        }

        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                storage[i][j]=arr[i][j]+Math.min(storage[i][j+1],Math.min(storage[i+1][j+1],storage[i+1][j]));
            }
        }

        return storage[0][0];

    }

    public static void main(String[] args) {
        int[][] arr={{1,1,1},{4,5,2},{7,8,9}};
        System.out.println(minCostM(arr));
        System.out.println(minPathDP(arr));
    }
}
