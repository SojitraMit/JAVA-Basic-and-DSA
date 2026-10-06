import java.util.Arrays;

public class Knapsack {
    public static int knapsack(int[] weight,int value[],int maxWeight){
        return knapsack(weight,value,maxWeight,0);
    }

    private static int knapsack(int[] weight, int[] value, int maxWeight, int i) {
        if(i==weight.length || maxWeight==0){
            return 0;
        }

        if(weight[i]>maxWeight){
            return knapsack(weight,value,maxWeight,i+1);
        }else{
            //include this ith item
            int opn1=value[i]+knapsack(weight,value,maxWeight-weight[i],i+1);

            //do not include ith item
            int opn2=knapsack(weight,value,maxWeight,i+1);

            return Math.max(opn1,opn2);
        }

    }

    public static int knapsackM(int[] weight,int value[],int maxWeight){
        int n = weight.length;
        int[][] storage = new int[n+1][maxWeight+1];
        for(int[] i1 : storage) {
            Arrays.fill(i1, -1);
        }
        return knapsackM(weight, value, maxWeight,storage,n);
    }

    private static int knapsackM(int[] weight, int[] value, int maxWeight, int[][] storage, int n) {
        if(n==0 || maxWeight==0) {
            storage[n][maxWeight] = 0;
            return storage[n][maxWeight];
        }
        if(storage[n][maxWeight]!=-1) {
            return storage[n][maxWeight];
        }

        if(weight[n-1] > maxWeight ) {
            storage[n][maxWeight] = knapsackM(weight, value, maxWeight, storage, n-1);
            return storage[n][maxWeight];
        }
        storage[n][maxWeight] = Math.max( knapsackM(weight, value, maxWeight, storage, n-1) ,
                knapsackM(weight, value, maxWeight-weight[n-1], storage, n-1) + value[n-1]
        );
        return storage[n][maxWeight];
    }


}
