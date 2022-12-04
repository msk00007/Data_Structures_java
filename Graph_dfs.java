import java.util.*;
class Graph_dfs {
    private int V; 
    private LinkedList<Integer> adj[];
     @SuppressWarnings("unchecked")
    Graph_dfs(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<>();
    }
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void dfsfun(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                dfsfun(n, visited);
        }
    }
    void DFS(int v) {

        boolean visited[] = new boolean[V];

        dfsfun(v, visited);
    }
    public static void main(String args[]) {
        Graph_dfs g = new Graph_dfs(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        System.out.println(
                "Following is Depth First Traversal "
                        + "(starting from vertex 2)");
        g.DFS(2);
    }
}
