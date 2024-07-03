class Solution {

    static double ans = -1.0;
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        for(List<String> eq: equations) {
            String src = eq.get(0);
            String tar = eq.get(1);

            if(!map.keySet().contains(src)) {
                map.put(src, count);
                count++;
            }

            if(!map.keySet().contains(tar)) {
                map.put(tar, count);
                count++;
            }
        }

        double[][] graph = new double[count][count];

        int index = 0;
        for(List<String> eq: equations) {
            int i = map.get(eq.get(0));
            int j = map.get(eq.get(1));
            double weight = values[index];

            graph[i][j] = weight;
            graph[j][i] = 1.0/weight;
            index++;
        }
     
        double[] result = new double[queries.size()];
        index = 0;
        for(List<String> quer: queries) {
          ans = -1.0;
        boolean[] visited = new boolean[count];
          if(!map.keySet().contains(quer.get(0)) || !map.keySet().contains(quer.get(1))) {
            ans = -1.0;
          } else {
            dfs(graph,map.get(quer.get(0)),map.get(quer.get(1)), 1.0, visited);
          }
          result[index] = ans;
          index++;
        }

        return result;
    }

    static void dfs(double[][] graph, int curr, int tar, double mul, boolean[] visited) {
        visited[curr] = true;

        if(curr == tar) {
            ans = mul;
            return;
        }

        double[] conn = graph[curr];
        for(int i=0;i<conn.length;i++) {

            if(!visited[i] && conn[i] > 0) {
                dfs(graph, i, tar, mul*graph[curr][i], visited);
            }
        }
    }
}