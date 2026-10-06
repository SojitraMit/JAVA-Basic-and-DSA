public class Fibbonacci {

    // Fib recursion
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }

        return fib(n-1) + fib(n-2);
    }

    // Fib Memoization
    public static int fibM(int n){
        int[] storage=new int[n+1];
        for(int i=0;i<n+1;i++){
            storage[i]=-1;
        }

        return fibM(n,storage);
    }

    private static int fibM(int n, int[] storage) {
        if(n==0 || n==1){
            storage[n]=n;
            return storage[n];
        }
        if(storage[n] != -1){
            return storage[n];
        }

        storage[n]=fibM(n-1,storage) + fibM(n-2,storage);
        return storage[n];
        // 0 1 1 2 3 5 8 13
    }

    // Fib DP
    public static int fibDP(int n){
        int storage[]=new int[n+1];
        storage[0]=0;
        storage[1]=1;

        for(int i=2;i<=n;i++){
            storage[i]=storage[i-1] + storage[i-2];
        }

        return storage[n];
    }

    public static void main(String[] args) {
        System.out.println(fibM(44));      // Fib Memoization
        System.out.println(fib(44));       // Fib recursion
        System.out.println(fibDP(44));     // Fib DP

    }
}
