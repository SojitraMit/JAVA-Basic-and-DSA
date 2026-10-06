public class Staircase {

    public  static int stair(int n){
        if(n==0) {
            return 1;
        }
        if(n==1) {
            return 1;
        }
        if(n==2) {
            return 2;
        }

        return stair(n-1)+stair(n-2)+stair(n-3);

    }

    public  static int stairDP(int n){
        int storage[]=new int[n+1];

        if(n==0) {
            return 1;
        }
        if(n==1) {
            return 1;
        }
        if(n==2) {
            return 2;
        }

        storage[0]=1;
        storage[1]=1;
        storage[2]=2;

        for(int i=3;i<=n;i++){
            storage[i]=storage[i-1] + storage[i-2] + storage[i-3];
        }

        return storage[n];

    }

    public static void main(String[] args) {
        System.out.println(stairDP(9));
        System.out.println(stair(9));
    }
}
