import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int count = 0;
    static int computers;
    static int edges;
    static boolean[][] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        computers = Integer.parseInt(br.readLine());
        edges = Integer.parseInt(br.readLine());
        graph = new boolean[computers + 1][computers + 1];

        for (int i = 0; i < edges; i++) {
            st = new StringTokenizer(br.readLine());
            int vertex1 = Integer.parseInt(st.nextToken());
            int vertex2 = Integer.parseInt(st.nextToken());

            graph[vertex1][vertex2] = true;
            graph[vertex2][vertex1] = true;
        }

        visited = new boolean[computers + 1];
        
        /*
        dfs
        
        dfs(1);
        count = computers == 1 ? 0 : count - 1;     
         */
        
        bfs(1);
        System.out.print(count);
    }

    private static void dfs(int v) {
        visited[v] = true;
        count++;

        for (int i = 1; i < computers + 1; i++) {
            if (graph[v][i] && !visited[i]) {
                dfs(i);
            }
        }
    }

    private static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        visited[v] = true;
        queue.offer(v);

        while (!queue.isEmpty()) {
            int computer = queue.poll();

            for (int i = 1; i < computers + 1; i++) {
                if (graph[computer][i] && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                    count++;
                }
            }
        }
    }
}
