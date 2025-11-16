package hm_20;

public class Main {
    public static void main(String[] args) {

        Graph graph = new Graph();

        // Adds a vertex
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);

        // Adds an edge
        graph.addEdge(1,2);
        graph.addEdge(2,3);

        System.out.println("Graph after aadding vertices and edges: ");
        System.out.println(graph);

        // Vertex check
        System.out.println("Does the vertex exist 1? " + graph.hasVertex(1));
        System.out.println("Does the vertex exist 4? " + graph.hasVertex(4));

        // Edges check
        System.out.println("Does the edge exist 1-2 " + graph.hasEdge(1,2));
        System.out.println("Does the edge exist 1-3 " + graph.hasEdge(1,3));

        // Delete edges
        graph.removeEdge(1,2);
        System.out.println("Graph after removing an edge 1-2 ");
        System.out.println(graph);

        // Delete vertex
        graph.revomeVertex(3);
        System.out.println("Graph after removing a vertex 3");
        System.out.println(graph);
    }
}
