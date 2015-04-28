package de.schmeller.graph;

import de.schmeller.graph.test.City;

public class Main {

    public static void main(String[] args) {
        Graph<City> cityGraph = new Graph<>();

        City passau = new City("Passau"), regensburg = new City("Regensburg"), münchen = new City("München"),
                linz = new City("Linz"), wien = new City("Wien");

        cityGraph.addNode(passau);
        cityGraph.addNode(regensburg);
        cityGraph.addNode(münchen);
        cityGraph.addNode(linz);
        cityGraph.addNode(wien);

        cityGraph.addEdge(passau, regensburg, 100);
        cityGraph.addEdge(regensburg, passau, 100);
        cityGraph.addEdge(passau, münchen, 200);
        cityGraph.addEdge(münchen, passau, 200);
        cityGraph.addEdge(regensburg, linz, 200);
        cityGraph.addEdge(linz, regensburg, 200);
        cityGraph.addEdge(linz, wien, 100);
    }
}
