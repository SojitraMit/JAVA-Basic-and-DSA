import java.util.ArrayList;
import java.util.Scanner;

public class GetPathDFS {

    public static ArrayList<Integer> getPath(int[][] edges, int start, int end, boolean[] visited) {
        if (start==end){
            ArrayList<Integer> ansArray=new ArrayList<>();
            ansArray.add(start);

            return ansArray;
        }

        visited[start]=true;
        int n=edges.length;

        for(int i=0;i<n;i++){
            if(edges[start][i]==1 && !visited[i]){
                ArrayList<Integer> ans=getPath(edges,i,end,visited);
                if(ans != null){
                    ans.add(start);
                    return ans;
                }
            }
        }

        return null;
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

        ArrayList<Integer> ans = getPath(edges, start, end, visited);
        if(ans!=null)
            for(int i : ans) {
                System.out.print(i+" ");
            }
    }


}
