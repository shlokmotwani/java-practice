import java.util.ArrayList;

public class PathInDirectedGraph {
    public int solve(int N, int[][] list) {
        int edges = list.length;
        ArrayList<Integer>[] graph = new ArrayList[N+1];
        for(int i=0; i<=N; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<edges; i++){
            int u = list[i][0];
            int v = list[i][1];
            graph[u].add(v);
        }

        int[] visited = new int[N+1];
        return dfs(1, graph, visited);
    }

    public int dfs(int src, ArrayList<Integer>[] graph, int[] visited){
        visited[src] = 1;
        if(src == visited.length-1){
            return 1;
        }

        for(int nbr: graph[src]){
            if(visited[nbr] == 0){
                int check = dfs(nbr, graph, visited);
                if(check == 1){
                    return 1;
                }
            }
        }
        return 0;
    }
}
