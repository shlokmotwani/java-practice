public class ShortestPathWithHurdles {
    public static void path(int[][] maze, int B, int C, int D, int E, int steps, int[] ans, int[][] visited){
        int N = maze.length;
        int M = maze[0].length;
        // sanity check
        if(B < 0 || B >= N || C < 0 || C >= M ||
                D < 0 || D >= N || E < 0 || E >= M ||
                maze[B][C] == 0 || maze[D][E] == 0 || visited[B][C] == 1){
            return;
        }

        // base case
        if(B == D && C == E){
            ans[0] = Math.min(ans[0], steps);
            return;
        }

        visited[B][C] = 1;
        path(maze, B-1, C, D, E, steps+1, ans, visited);    // go up
        path(maze, B, C+1, D, E, steps+1, ans, visited);    // go right
        path(maze, B+1, C, D, E, steps+1, ans, visited);    // go down
        path(maze, B, C-1, D, E, steps+1, ans, visited);    // go left
        visited[B][C] = 0;
    }

    public static void main(String[] args) {
        int[][] maze = new int[4][4];
        maze[0] = new int[]{1,1,0,0};
        maze[1] = new int[]{0,1,1,0};
        maze[2] = new int[]{0,0,1,1};
        maze[3] = new int[]{0,0,0,1};

        int[][] visited = new int[4][4];

        int[] ans = new int[]{Integer.MAX_VALUE};
        path(maze, 0, 0, 3, 3, 0, ans, visited);
        ans[0] = ans[0] == Integer.MAX_VALUE ? -1 : ans[0];
        System.out.println(ans[0]);
    }
}
