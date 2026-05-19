import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public int[][] getComponents(int A, int[][] B) {
        int N = B.length;
        ArrayList<Integer>[] graph = new ArrayList[A+1];
        for(int i=0; i<=A; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<N; i++){
            int u = B[i][0];
            int v = B[i][1];
            graph[u].add(v);
            graph[v].add(u);
        }

        boolean[] visited = new boolean[A+1];
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i=0; i<A; i++){
            ArrayList<Integer> component = new ArrayList<>();
            if(!visited[i]){
                dfs(i, graph, visited, component);
                Collections.sort(component);
                ans.add(component);
            }
        }

        Collections.sort(ans, (a, b) -> a.get(0) - b.get(0));

        int M = ans.size();
        int[][] result = new int[M][];
        for(int i=0; i<M; i++){
            ArrayList<Integer> current = ans.get(i);
            int K = current.size();
            int[] temp = new int[K];
            for(int j=0; j<K; j++){
                temp[j] = current.get(j);
            }
            result[i] = temp;
        }
        return result;
    }

    public void dfs(int src, ArrayList<Integer>[] graph, boolean[] visited, ArrayList<Integer> component){
        visited[src] = true;
        component.add(src);
        for(int nbr: graph[src]){
            if(!visited[nbr]){
                dfs(nbr, graph, visited, component);
            }
        }
    }
    public static void main(String[] args) {

    }
}