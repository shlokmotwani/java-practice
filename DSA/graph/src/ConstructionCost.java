import java.util.ArrayList;
import java.util.PriorityQueue;

public class ConstructionCost {
    public int solve(int A, int[][] B) {
        int C = B.length;
        int ans = 0;
        int MOD = 1000000007;

        ArrayList<Pair>[] graph = new ArrayList[A+1];
        for(int i=0; i<=A; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<C; i++){
            int curr = B[i][0];
            int nbr = B[i][1];
            int weight = B[i][2];

            graph[curr].add(new Pair(nbr, weight));
            graph[nbr].add(new Pair(curr, weight));
        }

        PriorityQueue<Pair> heap = new PriorityQueue<>((a, b) -> a.weight - b.weight);
        boolean[] visited = new boolean[A+1];
        visited[1] = true;
        for(Pair pair : graph[1]){
            heap.add(pair);
        }

        while(!heap.isEmpty()){
            Pair curr = heap.remove();
            if(visited[curr.vertex]){
                continue;
            }
            visited[curr.vertex] = true;
            ans = (int)((long)ans + curr.weight) % MOD;
            for(Pair pair: graph[curr.vertex]){
                if(!visited[pair.vertex]){
                    heap.add(pair);
                }
            }
        }

        for(int i=1; i<=A; i++){
            if(!visited[i]){
                return -1;
            }
        }
        return ans % MOD;
    }

    class Pair{
        int vertex;
        int weight;

        Pair(int vertex, int weight){
            this.vertex = vertex;
            this.weight = weight;
        }
    }
}
