package de.schmeller.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mtronics_dev
 * @version 1.0
 */
public class Graph<N> {

    /**
     * Contains all nodes in the graph in an unordered fashion.
     */
    private List<Node<N>> nodes;

    /**
     * Constructs a new Graph and initializes the {@link Graph#nodes list of nodes}.
     */
    public Graph() {
        nodes = new ArrayList<>();
    }

    /**
     * Adds a node to the graph's list.
     * <p>It can then be connected to other nodes via {@link Edge edges}.</p>
     *
     * @param node The node to be added to the graph.
     */
    public void addNode(N node) {
        nodes.add(new Node<>(node));
    }

    /**
     * Adds an {@link Edge edge} pointing from {@code from} to {@code to} with the weight {@code weight}.
     * <p>Note that this is a weighted and directed edge.</p>
     *
     * @param from The node where the edge starts at.
     * @param to The node where the edge points to.
     * @param weight The edge's weight.
     */
    public void addEdge(N from, N to, int weight) {
        Node<N> start = getNode(from), end = getNode(to);

        if (start != null && end != null) start.addEdge(new Edge(weight, end));
        else throw new IllegalStateException("Not all nodes needed for the new edge are present.");
    }

    /**
     * Searches the node that contains the searched object.
     *
     * @param search The object that is contained by the node searched for.
     * @return The {@link Node node} which contains {@code search}, {@code null} if not found.
     */
    private Node<N> getNode(N search) {
        for (Node<N> n : nodes) if (n.getContent().equals(search)) return n;
        return null;
    }
}
