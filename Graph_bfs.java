import java.util.*;
class Graph_bfs {
	private int V;
	private LinkedList<Integer> adj[];
	@SuppressWarnings("unchecked")
	Graph_bfs(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList<>();
	}

	void addEdge(int v, int w) {
		adj[v].add(w);
	}

	void BFS(int s) {
		boolean visited[] = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[s] = true;
		queue.add(s);

		while (queue.size() != 0) {
			s = queue.poll();
			System.out.print(s + " ");
			Iterator<Integer> i = adj[s].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of vertices");
		int vertex = sc.nextInt();
		Graph_bfs g = new Graph_bfs(vertex);
		System.out.println("Enter v,w values");
		int run = 1;
		while(run==1){
			int v = sc.nextInt();
			int w = sc.nextInt();
			g.addEdge(v, w);
			System.out.println("to add edges press 1 to stop press 0");
			run = sc.nextInt(); 
		}

		System.out.println("Enter vertex to traverse : ");
		int n = sc.nextInt();
		System.out.println("Breadth First Traversal " +
				"(starting from vertex "+n +")");
		g.BFS(n);
		sc.close();
	}
}

