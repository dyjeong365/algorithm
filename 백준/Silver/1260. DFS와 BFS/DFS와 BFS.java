import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static boolean[][] graph;
    static StringBuilder sb;
    static boolean[] visited;
    static int length;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        final int M = Integer.parseInt(st.nextToken());
        final int V = Integer.parseInt(st.nextToken());
        length = n + 1;
        graph = new boolean[length][length];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int vertex1 = Integer.parseInt(st.nextToken());
            int vertex2 = Integer.parseInt(st.nextToken());

            graph[vertex1][vertex2] = true;
            graph[vertex2][vertex1] = true;
        }
        visited = new boolean[length];
        dfs(V);

        sb.append("\n");

        visited = new boolean[length];
        bfs(V);

        System.out.print(sb);
    }

    private static void dfs(final int V) {
        visited[V] = true;
        sb.append(V).append(" ");

        for (int j = 1; j < length; j++) {
            if (graph[V][j] && !visited[j]) {
                dfs(j);
            }
        }
    }

    private static void bfs(final int V) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(V);
        visited[V] = true;
        sb.append(V).append(" ");

        while (!queue.isEmpty()) {
            int vertex = queue.poll();

            for (int i = 1; i < length; i++) {
                if (graph[vertex][i] && !visited[i]) {
                    visited[i] = true;
                    sb.append(i).append(" ");
                    queue.offer(i);
                }
            }
        }
    }
}
