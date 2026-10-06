import java.awt.*;

public class EditDistance {

    public static int editDistance(String s1,String s2){
        if(s1.length()==0) {
            return s2.length();
        }
        if(s2.length()==0) {
            return s1.length();
        }

        if(s1.charAt(0)==s2.charAt(0)) {
            return editDistance(s1.substring(1), s2.substring(1));
        }
        return 1 + Math.min( editDistance(s1.substring(1), s2)  ,
                Math.min(editDistance(s1.substring(1), s2.substring(1)), editDistance(s1, s2.substring(1)))
        );

    }

    public static int editDistanceM(String s1,String s2){
        int[][] storage=new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<s1.length()+1;i++){
            for(int j=0;j<s2.length()+1;j++){
                storage[i][j]=-1;
            }
        }

        return editDistanceM(s1,s2,storage);
    }

    private static int editDistanceM(String s1, String s2, int[][] storage) {
        int m = s1.length();
        int n = s2.length();
        if(s1.length()==0) {
            storage[m][n] = s2.length();
            return storage[m][n];
        }
        if(s2.length()==0) {
            storage[m][n] = s1.length();
            return storage[m][n];
        }
        if(storage[m][n]!=-1) {
            return storage[m][n];
        }
        if(s1.charAt(0)==s2.charAt(0)) {
            storage[m][n] = editDistanceM(s1.substring(1), s2.substring(1), storage);
            return storage[m][n];
        }

        storage[m][n] = 1 + Math.min(Math.min(editDistanceM(s1.substring(1), s2.substring(1), storage),
                editDistanceM(s1.substring(1), s2, storage)
        ), editDistanceM(s1, s2.substring(1), storage));
        return storage[m][n];
    }

    public static int editDistanceDP(String s1,String s2){
        int m = s1.length();
        int n = s2.length();
        int storage[][]=new int[m+1][n+1];

        for(int i=0;i<=m;i++){
            storage[i][0]=i;
        }
        for(int j=0;j<=n;j++){
            storage[0][j]=j;
        }

        for(int i=1;i<=m;i++) {
            for(int j=1;j<=n;j++) {
                if(s1.charAt(m-i) == s2.charAt(n-j)) {
                    storage[i][j] = storage[i-1][j-1];
                }
                else {
                    storage[i][j] = 1 + Math.min(Math.min(storage[i-1][j-1], storage[i-1][j] ), storage[i][j-1] ) ;
                }
            }
        }
        return storage[m][n];
    }

    public static void main(String[] args) {
        String s1="ahfkjhlfjsdka";
        String s2="afkljdlfkjdslf";
        System.out.println(editDistanceDP(s1,s2));
        System.out.println(editDistanceM(s1,s2));
        System.out.println(editDistance(s1,s2));



    }
}
