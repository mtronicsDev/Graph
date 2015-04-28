package de.schmeller.graph;

/**
 * Created by Maxi on 23.04.2015.
 */
public class Edge {

    private int weight;
    private Node destination;

    public Edge(int weight, Node destination) {
        this.weight = weight;
        this.destination = destination;
    }

    public int getWeight() {
        return weight;
    }

    public Node getDestination() {
        return destination;
    }
}
