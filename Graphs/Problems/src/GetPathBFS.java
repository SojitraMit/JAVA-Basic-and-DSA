import java.util.*;

public class GetPathBFS {

    public static ArrayList<Integer> getPath(int[][] edges,int start,int end,boolean[] visited){

        Queue<Integer> queue = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        queue.add(start);
        visited[start] = true;
        while( !queue.isEmpty() && queue.peek()!=end) {

            int front = queue.poll();
            for(int i=0;i<edges.length;i++) {
                if(!visited[i] && edges[front][i] == 1) {
                    queue.add(i);
                    visited[i] = true;
                    map.put(i, front);
                }
            }

        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(!map.containsKey(end)) {
            return null;
        }
        else {
            ans.add(end);
            int f = map.get(end);
            while(f!=start) {
                ans.add(f);

                f = map.get(f);

            }
            ans.add(start);
        }

        return ans;

    }

    public static void main (String[]args){
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
        int start = s.nextInt();
        int end = s.nextInt();
        boolean visited[] = new boolean[n];
        ArrayList<Integer> ans = getPath(edges, start, end, visited);
        if (ans != null)
            for (int i : ans) {
                System.out.print(i + " ");
            }
    }
}
