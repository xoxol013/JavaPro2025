package hm_20;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph {

    private final Map<Integer, Set<Integer>> adjancencyList = new HashMap<>();

    // Adds a vertex
    public void addVertex(int vertex) {
        adjancencyList.putIfAbsent(vertex, new HashSet<>());
    }

    // Adds an edge
    public void addEdge(int source, int destination) {
        addVertex(source);
        addVertex(destination);
        adjancencyList.get(source).add(destination);
        adjancencyList.get(destination).add(source);
    }

    // Deletes a vertex
    public void revomeVertex(int vertex) {
        if (!adjancencyList.containsKey(vertex)) return;

        // We delete all edges that lead to this vertex
    adjancencyList.values().forEach(edges -> edges.remove(vertex));
    adjancencyList.remove(vertex);
    }

    // Delete edge
    public void removeEdge(int source, int destination) {
        if (adjancencyList.containsKey(source)) {
            adjancencyList.get(source).remove(destination);
        }
        if (adjancencyList.containsKey(destination)) {
            adjancencyList.get(destination).remove(source);
        }
    }

    // Does the vertex exist
    public boolean hasVertex(int vertx) {
        return adjancencyList.containsKey(vertx);
    }

    // Does the edge exist
    public boolean hasEdge(int source, int destination) {
        return adjancencyList.containsKey(source) && adjancencyList.get(source).contains(destination);
    }

    public String toString() {
        return adjancencyList.toString();
    }
}
