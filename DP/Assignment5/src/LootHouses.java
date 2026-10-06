import java.util.Arrays;

public class LootHouses {
    public static int getMaxMoney(int arr[], int n) {

        if (n <= 0) {
            return 0;
        }
        return Math.max(getMaxMoney(arr, n - 1), arr[n - 1] + getMaxMoney(arr, n - 2));
    }

    public static int lootHousesMemo(int[] arr,int n) {
        int[] storage = new int[n+1];
        Arrays.fill(storage, -1);
        return lootHousesMemo(arr, n,storage);
    }

    public static int lootHousesMemo(int[] arr, int n, int[] storage) {

        if(n<=0) {
            storage[0] = 0;
            return storage[0];
        }
        if(storage[n]!=-1) {
            return storage[n];
        }

        storage[n] = Math.max(lootHousesMemo(arr, n-1,storage),  lootHousesMemo(arr, n-2, storage)+arr[n-1]);
        return storage[n];
    }

    public static int getMaxMoneyDP(int arr[], int n){

        int[] storage = new int[n+1];
        storage[0] = 0;
        storage[1] = arr[0];
        for(int i=2;i<=n;i++) {
            storage[i] = Math.max(storage[i-1] , arr[i-1] + storage[i-2]);
        }
        return storage[n];
    }

}
