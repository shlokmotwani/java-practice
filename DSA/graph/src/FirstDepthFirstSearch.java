import java.util.ArrayList;

public class FirstDepthFirstSearch {
    public int solve(int[] A, final int B, final int C) {
        int N = A.length;
        int maxNum = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            maxNum = Math.max(maxNum, A[i]);
        }
        maxNum = Math.max(maxNum, N);
        if(B > maxNum || C > maxNum){
            return 0;
        }
        if(B == C){
            return 1;
        }
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i<=maxNum; i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int i=1; i<N; i++){
            int node1 = A[i];
            int node2 = i+1;
            graph.get(node1).add(node2);
        }
        if(graph.get(C).size() == 0){
            return 0;
        }
        boolean[] visited = new boolean[N+1];
        return dfs(graph, C, B, visited);
    }

    public int dfs(ArrayList<ArrayList<Integer>> graph, int curr, int target, boolean[] visited){
        if(curr == target){
            return 1;
        }
        visited[curr] = true;
        for(int nbr: graph.get(curr)){
            if(!visited[nbr]){
                int ans = dfs(graph, nbr, target, visited);
                if(ans == 1){
                    return 1;
                }
            }
        }
        return 0;
    }
}
