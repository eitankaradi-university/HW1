public class Assignment01Q05 {

    public static int findShortestPath(int[][] matrix, int i, int j) {
        // The shortest path from a vertex to itself is 0
        if (i == j) {
            return 0;
        }

        int n = matrix.length;

        // dist[v] stores the shortest distance from i to v, or -1 if not visited yet
        int[] dist = new int[n];
        for (int v = 0; v < n; v++) {
            dist[v] = -1;
        }

        // Array-based FIFO queue (at most n vertices can ever be enqueued)
        int[] queue = new int[n];
        int head = 0;
        int tail = 0;

        // Start BFS from source vertex i
        dist[i] = 0;
        queue[tail++] = i;

        while (head < tail) {
            int curr = queue[head++];

            // Scan all neighbors of curr
            for (int next = 0; next < n; next++) {
                if (matrix[curr][next] == 1 && dist[next] == -1) {
                    dist[next] = dist[curr] + 1;
                    if (next == j) {
                        return dist[next]; // Target reached via shortest path
                    }
                    queue[tail++] = next;
                }
            }
        }

        // Target j is unreachable from i
        return -1;
    }
}