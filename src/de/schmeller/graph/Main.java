package de.schmeller.graph;

import de.schmeller.graph.test.City;

public class Main {

    public static void main(String[] args) {
        Graph<City> cityGraph = new Graph<>();

        City passau = new City("Passau"), regensburg = new City("Regensburg"), m�nchen = new City("M�nchen"),
                linz = new City("Linz"), wien = new City("Wien");

        cityGraph.addNode(passau);
        cityGraph.addNode(regensburg);
        cityGraph.addNode(m�nchen);
        cityGraph.addNode(linz);
        cityGraph.addNode(wien);

        cityGraph.addEdge(passau, regensburg, 100);
        cityGraph.addEdge(regensburg, passau, 100);
        cityGraph.addEdge(passau, m�nchen, 200);
        cityGraph.addEdge(m�nchen, passau, 200);
        cityGraph.addEdge(regensburg, linz, 200);
        cityGraph.addEdge(linz, regensburg, 200);
        cityGraph.addEdge(linz, wien, 100);
    }
}
