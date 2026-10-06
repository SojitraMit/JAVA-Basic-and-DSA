public class AllWays {

    public static int allWays(int a,int b){
        return allWays(a,b,1);
    }

    private static int allWays(int a, int b, int num) {
        int val= (int) (a-Math.pow(num,b));
        return 1;
    }

    public static void main(String[] args) {

    }
}
