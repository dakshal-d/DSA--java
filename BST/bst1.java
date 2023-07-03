import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class TrieNode {
    Map<Integer, TrieNode> child = new HashMap<>();
    int go = 0; // Number of elements goes through this node
    
    public void increase(int number, int d) {
        TrieNode cur = this;
        for (int i = 17; i >= 0; i--) {
            int bit = (number >> i) & 1;
            if (!cur.child.containsKey(bit))
                cur.child.put(bit, new TrieNode());
            cur = cur.child.get(bit);
            cur.go += d;
        }
    }
    
    public int findMax(int number) {
        TrieNode cur = this;
        int ans = 0;
        for (int i = 17; i >= 0; i--) {
            int bit = (number >> i) & 1;
            if (cur.child.containsKey(1 - bit) && cur.child.get(1 - bit).go > 0) {
                cur = cur.child.get(1 - bit);
                ans |= (1 << i);
            } else {
                cur = cur.child.get(bit);
            }
        }
        return ans;
    }
}

class Solution {
    TrieNode trieRoot = new TrieNode();
    
    public int[] maxGeneticDifference(int[] parents, int[][] queries) {
        int n = parents.length;
        int m = queries.length;
        int root = -1;
        
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int i = 0; i < n; i++) {
            if (parents[i] == -1)
                root = i;
            else
                graph.get(parents[i]).add(i);
        }
        
        List<List<int[]>> queryByNode = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            queryByNode.add(new ArrayList<>());
        }
        
        for (int i = 0; i < m; i++) {
            queryByNode.get(queries[i][0]).add(new int[]{queries[i][1], i}); // node -> list of pairs (val, idx)
        }
        
        int[] ans = new int[m];
        dfs(root, graph, queryByNode, ans);
        return ans;
    }
    
    void dfs(int u, List<List<Integer>> graph, List<List<int[]>> queryByNode, int[] ans) {
        trieRoot.increase(u, 1);
        for (int[] p : queryByNode.get(u)) {
            ans[p[1]] = trieRoot.findMax(p[0]);
        }
        for (int v : graph.get(u)) {
            dfs(v, graph, queryByNode, ans);
        }
        trieRoot.increase(u, -1);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter the number of nodes in the tree: ");
        int n = scanner.nextInt();
        int[] parents = new int[n];

        //System.out.println("Enter the parent array (-1 for the root):");
        for (int i = 0; i < n; i++) {
            parents[i] = scanner.nextInt();
        }

        //System.out.print("Enter the number of queries: ");
        int m = scanner.nextInt();
        int[][] queries = new int[m][2];

        //System.out.println("Enter the queries (node, value):");
        for (int i = 0; i < m; i++) {
            queries[i][0] = scanner.nextInt();
            queries[i][1] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int[] result = solution.maxGeneticDifference(parents, queries);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
