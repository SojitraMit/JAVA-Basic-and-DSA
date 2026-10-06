import java.util.Scanner;

public class Graph {

    public static void printDFS(int[][] edges){
        boolean visited[]=new boolean[edges.length];
        for(int i=0;i<edges.length;i++){
            if(!visited[i]){
                printDFSHelper(edges,i,visited);
            }
        }
    }

    private static void printDFSHelper(int[][] edges, int sv, boolean[] visited) {
        System.out.println(sv);
        visited[sv]=true;

        int n=edges.length;
        for(int i=0;i<n;i++){
            if(edges[sv][i]==1 && !visited[i]){
                printDFSHelper(edges,i,visited);
            }
        }

    }

    public static void printBFS(int[][] edges){
        boolean visited[]=new boolean[edges.length];
        for (int i=0;i< edges.length;i++) {
            if(!visited[i]) {
                printBFSHelper(edges, i, visited);
            }
        }
    }

    public static void printBFSHelper(int[][] edges, int sv, boolean[] visited){
        QueueUsingLL<Integer> q=new QueueUsingLL<>();
        q.enqueue(sv);
        int n=edges.length;
        visited[sv]=true;

        while(!q.isEmpty()){
            int front;
            try {
                front=q.dequeue();
            } catch (QueueEmptyException e) {
                return;
            }
            System.out.println(front);
            for(int i=0;i<n;i++){
                if(edges[front][i]==1 && !visited[i]){
                    q.enqueue(i);
                    visited[i]=true;
                }
            }
        }
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

        System.out.println("DFS");
        printDFS(edges);
        System.out.println("BFS");
        printBFS(edges);
    }
}
