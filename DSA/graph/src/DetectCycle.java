import java.util.ArrayList;

public class DetectCycle {
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
        int[] path = new int[N+1];

        for(int i=0; i<edges; i++){
            int curr = list[i][0];
            if(visited[curr] == 0){
                int cyclic = dfs(curr, graph, visited, path);
                if(cyclic == 1){
                    return 1;
                }
            }
        }
        return 0;
    }

    public int dfs(int src, ArrayList<Integer>[] graph, int[] visited, int[] path){
        visited[src] = 1;
        path[src] = 1;
        for(int nbr: graph[src]){
            if(path[nbr] == 1){
                return 1;
            }
            if(visited[nbr] == 0){
                int cyclic = dfs(nbr, graph, visited, path);
                if(cyclic == 1){
                    return 1;
                }
            }
        }
        path[src] = 0;
        return 0;
    }
}
