//package Graph;
//
//import java.util.ArrayList;
//
//public class BFS {
//    public static void main(String[] args) {
//        int[][] graph = {
//                {0, 1, 1, 0, 0, 0},
//                {1, 0, 0, 1, 1, 0},
//                {1, 0, 0, 0, 1, 0},
//                {0, 1, 0, 0, 1, 1},
//                {0, 1, 1, 1, 0, 1},
//                {0, 0, 0, 1, 1, 0}
//        };
//        bfs(graph, 0);
//    }
//
//    static void bfs(int[][] graph, int start) {
//        boolean[] visited = new boolean[graph.length];
//        ArrayList<Integer> queue = new ArrayList<>();
//        queue.add(start);
//        visited[start] = true;
//        while (!queue.isEmpty()) {
//            int node = queue.poll();
//            System.out.print(node + " ");
//            for (int i = 0; i < graph.length; i++) {
//                if (graph[node][i] == 1 && !visited[i]) {
//                    queue.add(i);
//                    visited[i] = true;
//                }
//            }
//        }
//    }
//}
