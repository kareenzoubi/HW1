public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
       if (i == j) { \\base case
            return 0;
        }

        int n = m.length;
        // array to store the shortest distance from i to every cell
        int[] dist = new int[n];
        for (int k = 0; k < n; k++) {
            dist[k] = -1;
        }
        dist[i] = 0; 
//we go step by step till we reach the edge of the array
        for (int step = 0; step < n - 1; step++) {
            // checcking for all cells in the array if we've reached them with the current step , if yes then that means the they are step steps away from i
            for (int u = 0; u < n; u++) {
                if (dist[u] == step) {
                    for (int v = 0; v < n; v++) {
                        // if there is an edge and we haven't reached v before
                        if (m[u][v] == 1 && dist[v] == -1) {
                            dist[v] = step + 1;
                            
                            // if we found our target j, return the distance
                            if (v == j) {
                                return dist[v];
                            }
                        }
                    }
                }
            }
        }

        // if we finished all possible steps and didn't reach j
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}