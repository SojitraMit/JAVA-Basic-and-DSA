import java.util.Scanner;

public class HasPath {

    public static boolean hasPath(int[][] edges,int start,int end,boolean[] visited){
        if(edges[start][end]==1){
            return true;
        }
        visited[start]=true;

        for(int i=0;i<edges.length;i++){
            if(edges[start][i]==1 && !visited[i]){
                if(hasPath(edges,i,end,visited)){
                    return true;
                }
            }
        }

        return false;

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int e= s.nextInt();

        int edges[][]=new int[n][n];
        for(int i=0;i<e;i++){
            int fv=s.nextInt();
            int sv=s.nextInt();
            edges[fv][sv]=1;
            edges[sv][fv]=1;
        }

        int start=s.nextInt();
        int end=s.nextInt();
        boolean visited[]=new boolean[n];


        System.out.println(hasPath(edges,start,end,visited));
    }
}
