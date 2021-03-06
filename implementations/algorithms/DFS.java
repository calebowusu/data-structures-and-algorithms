package algorithms;

import java.util.List;
import java.util.Stack;

public class DFS {
  private static class Edge {
    private int from, to;    

    public Edge(int from, int to) {
      this.from = from;
      this.to = to;      
    }
  }

  public void dfs(List<List<Edge>> graph, int start) {
    Stack<Integer> stack = new Stack<>();
    stack.push(start);
    boolean[] visited = new boolean[graph.size()];
    visited[start] = true;
    int node;
    while (!stack.isEmpty()) {
      node = stack.pop();
      for (Edge edge : graph.get(node)) {
        if (!visited[edge.to]) {
          stack.push(edge.to);
          visited[edge.to] = true;
        }
      }
    }
  }
}