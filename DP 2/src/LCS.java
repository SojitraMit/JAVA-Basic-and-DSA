import java.awt.*;


//longest common subsequence
public class LCS {
    public static int lcs(String s,String t){
        if(s.length()==0 || t.length()==0){
            return 0;
        }

        if(s.charAt(0)==t.charAt(0)){
            return 1+lcs(s.substring(1),t.substring(1));
        }else{
            int opn1=lcs(s,t.substring(1));
            int opn2=lcs(s.substring(1),t);
            //int opn3=lcs(s.substring(1),t.substring(1));

            return Math.max(opn1,opn2);
        }
    }

    public static int lcsM(String s,String t){
        int[][] storage=new int[s.length()+1][t.length()+1];
        for(int i=0;i<storage.length;i++){
            for(int j=0;j<storage[0].length;j++){
                storage[i][j]=-1;
            }
        }

        return lcsM(s,t,storage);
    }

    private static int lcsM(String s, String t, int[][] storage) {
        int m=s.length();
        int n=t.length();

        if(storage[m][n] != -1){
            return storage[m][n];
        }

        if(m==0 || n==0){
            storage[m][n]=0;
            return storage[m][n];
        }

        if(s.charAt(0)==t.charAt(0)){
            storage[m][n]=1+lcsM(s.substring(1),t.substring(1),storage);
            return storage[m][n];
        }else{
            int opn1=lcsM(s,t.substring(1),storage);
            int opn2=lcsM(s.substring(1),t,storage);
            //int opn3=lcsM(s.substring(1),t.substring(1),storage);

            storage[m][n]=Math.max(opn1,opn2);
            return storage[m][n];
        }
    }

    public static int lcsDP(String s,String t){
        int m=s.length();
        int n=t.length();
        int[][] storage=new int[m+1][n+1];

        storage[0][0]=0;

        for(int i=0;i<=m;i++){
            storage[i][0]=0;
        }
        for(int i=0;i<=n;i++){
            storage[0][i]=0;
        }

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(m-i)==t.charAt(n-j)){
                    storage[i][j]=1+storage[i-1][j-1];
                }else{
                    storage[i][j]=Math.max(storage[i][j-1],storage[i-1][j]);
                }
            }
        }

        return storage[m][n];


    }

    public static void main(String[] args) {
        String s="agihadsgjjgljglajgl";
        String t="bhighgjdlgjfldjgfdlkg";
        System.out.println(lcsM(s,t));
        System.out.println(lcsDP(s,t));
        System.out.println(lcs(s,t));

    }
}
