package de.schmeller.graph;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Maxi on 23.04.2015.
 */
public class Node<N> {

    private List<Edge> edges;
    private N content;

    public Node(N node) {
        edges = new LinkedList<>();
        content = node;
    }

    public N getContent() {
        return content;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void addEdge(Edge edge) {
        edges.add(edge);
    }
}
