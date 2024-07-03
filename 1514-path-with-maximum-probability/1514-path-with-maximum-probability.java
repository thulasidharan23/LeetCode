import java.util.*;

class Solution {

    static class Pair {
        int node;
        double probability;

        Pair(int node, double probability) {
            this.node = node;
            this.probability = probability;
        }
    }

    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            double prob = succProb[i];
            adj.get(a).add(new Pair(b, prob));
            adj.get(b).add(new Pair(a, prob));
        }

        double[] probabilities = new double[n];
        probabilities[start] = 1.0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.probability, a.probability));
        pq.add(new Pair(start, 1.0));

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int node = current.node;
            double currentProb = current.probability;

            if (node == end) {
                return currentProb;
            }

            for (Pair neighbor : adj.get(node)) {
                int nextNode = neighbor.node;
                double newProb = currentProb * neighbor.probability;

                if (newProb > probabilities[nextNode]) {
                    probabilities[nextNode] = newProb;
                    pq.add(new Pair(nextNode, newProb));
                }
            }
        }

        return 0.0;
    }
}
