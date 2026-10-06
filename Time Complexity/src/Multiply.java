public class Multiply {
    public static int multiplyRec(int m, int n){
        if(n == 1)
            return m;
        return m + multiplyRec(m,  n - 1);
    }

    public static void main(String[] args){
        long start =System.currentTimeMillis();
        int ans=multiplyRec(500000,4000);
        long end =System.currentTimeMillis();
        System.out.print(end-start);
    }
}
