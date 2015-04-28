package de.schmeller.graph.test;

/**
 * @author mtronics_dev
 * @version 1.0
 */
public class City {

    private String name;

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
