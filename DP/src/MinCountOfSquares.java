public class MinCountOfSquares {

    public static int minCount(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        int min=Integer.MAX_VALUE;
        for(int i=1;i<=Math.sqrt(n);i++){
            int count=minCount(n-(i*i));
            if(count<min){
                min=count;
            }
        }

        return 1+min;
    }

    public static int minCountM(int n){
        int storage[]=new int[n+1];
        return minCountM(n,storage);
    }

    private static int minCountM(int n, int[] storage) {
        if(n==0){
            storage[0]=0;
            return storage[n];
        }
        if(n==1){
            storage[1]=1;
            return storage[n];
        }
        if(storage[n] != 0){
            return storage[n];
        }

        int min=Integer.MAX_VALUE;
        for(int i=1;i<=Math.sqrt(n);i++){
            int count=minCountM(n-(i*i),storage);
            if(count<min){
                min=count;
            }
        }

        storage[n]=1+min;
        return storage[n];
    }

    public static int minCountDP(int n) {
        int[] storage  = new int[n+1];
        storage[0]=0;
        storage[1] =1;

        for(int i=2;i<=n;i++) {
            int min = Integer.MAX_VALUE;
            for(int j=1;j<=Math.sqrt(i);j++) {
                int count = storage[i-(j*j)];
                if(min > count) {
                    min = count;
                }

            }
            storage[i] = min + 1;

        }
        return storage[n];
    }

    public static void main(String[] args) {
        System.out.println(minCountM(99));
        System.out.println(minCountDP(99));
        System.out.println(minCount(99));
    }
}
