import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class isConnected {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int e = s.nextInt();
        int edges[][] = new int[n][n];
        for (int i = 0; i < e; i++) {
            int fv = s.nextInt();
            int sv = s.nextInt();
            edges[fv][sv] = 1;
            edges[sv][fv] = 1;
        }

        boolean visited[]=new boolean[n];
        System.out.println(IsConnected(edges,0,visited));
    }

    private static boolean IsConnected(int[][] edges,int sv, boolean[] visited) {
        Queue<Integer> q=new LinkedList<>();
        q.add(sv);

        while (!q.isEmpty()){
            int front=q.poll();


            for(int i=0;i<edges.length;i++){
                if(edges[front][i]==1 && !visited[i]){
                    q.add(i);
                    visited[i]=true;
                }
            }
        }

        for(boolean b : visited){
            if(b==false){
                return false;
            }
        }

        return true;
    }

}
