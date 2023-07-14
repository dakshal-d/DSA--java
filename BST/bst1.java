

// import java.util.Scanner;

// class Main {
// 	final static int INF = 999 ;
// 	static int V ;

// 	static void floydWarshall(int graph[][])
// 	{
// 		int dist[][] = new int[V][V];
// 		int i, j, k;

// 		for (i = 0; i < V; i++)
// 			for (j = 0; j < V; j++)
// 				dist[i][j] = graph[i][j];

// 		for (k = 0; k < V; k++) {
// 			// Pick all vertices as source one by one
// 			for (i = 0; i < V; i++) {
				
// 				for (j = 0; j < V; j++) {
			
// 					if (dist[i][k] + dist[k][j]
// 						< dist[i][j])
// 						dist[i][j]
// 							= dist[i][k] + dist[k][j];
// 				}
// 			}
// 		}

// 		// Print the shortest distance matrix
// 		printSolution(dist);
// 	}

// 	static void printSolution(int dist[][])
// 	{
// 		for (int i = 0; i < V; ++i) {
// 			for (int j = 0; j < V; ++j) {
// 				if (dist[i][j] == INF)
// 					System.out.print("INF ") ;
// 				else
// 					System.out.print(dist[i][j] + " ") ;
// 			}
// 			System.out.println();
// 		}
// 	}

// 	// Driver's code
// 	public static void main(String[] args)
// 	{
	    
// 	    Scanner sc = new Scanner(System.in) ;
	    
// 	    V = sc.nextInt() ;
	    
// 	    int edges = sc.nextInt() ;
	    
// 	    int graph[][] = new int [V][V] ;
	    
// 	    for(int i = 0 ; i < V ; i++){
// 	        for(int j = 0 ; j < V ; j++){
// 	            if(i==j)
// 	                graph[i][j] = 0 ;
// 	            else
// 	                graph[i][j] = INF ;
// 	        }
// 	    }
	    
// 	    int start, end, value ;
	    
// 	    for(int i = 0 ; i < edges ; i++){
// 	        start = sc.nextInt() ;
// 	        end = sc.nextInt() ;
// 	        value = sc.nextInt() ;
	        
// 	        graph[start][end] = value ;
// 	        graph[end][start] = value ;
// 	    }
// 	    System.out.println("Original matrix") ;
// 	    for(int i = 0 ; i < V ; i++){
// 	        for(int j = 0 ; j < V ; j++){
// 	            if(graph[i][j] == INF)
// 	                System.out.print("INF ") ;
// 	            else
// 	                System.out.print(graph[i][j]+" ") ;
// 	        }
// 	        System.out.println() ;
// 	    }
// 	    System.out.println() ;
	    
// 	    System.out.println("Shortest path matrix") ;
	    
// 	    floydWarshall(graph);
// 	}
// }
import java.util.Scanner;

class Main {
    static int[][] adj;
    static int v;
    static Node[] vertex;
    static Node head, p;
    static int[] c;
    static int dist, pre, flag, k;

    static class Node {
        int ind;
        Node next;
        Node prev;

        Node(int ind) {
            this.ind = ind;
        }
    }

    static void work() {
        int pre_i = pre;
        for (int i = 0; i < v; ++i) {
            if (adj[pre_i][i] > -1000) {
                if (c[i] != 0) {
                    c[i] = 0;
                    pre = i;
                    p.next = vertex[i];
                    p.next.prev = p;
                    p = p.next;
                    dist = dist + adj[pre_i][i];
                    work();
                }
            }

        }
        if (dist >= k) {
            flag = 1;
        }
        if (p != head) {
            dist = dist - adj[p.ind][p.prev.ind];
            c[p.ind] = 1;
            p = p.prev;
        }
    }

    public static void main(String[] args) {
        int j, l, e, a, b, d, x = 4;
        Scanner scanner = new Scanner(System.in);

        vertex = new Node[10];
        for (j = 0; j < 10; ++j) {
            vertex[j] = new Node(j);
        }
        flag = 0;

        v = scanner.nextInt();
        e = scanner.nextInt();
        k = scanner.nextInt();

        adj = new int[v][v];
        c = new int[v];
        for (j = 0; j < v; ++j) {
            for (l = 0; l < v; ++l) {
                adj[j][l] = -100000;
            }
            c[j] = 1;
        }
        for (j = 0; j < e; ++j) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            d = scanner.nextInt();
            adj[a][b] = d;
            adj[b][a] = d;
        }

        dist = 0;
        head = vertex[0];
        p = vertex[0];
        pre = 0;
        c[0] = 0;
        work();
        System.out.println(flag);
    }
}

