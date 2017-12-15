package com.blannoo.adventofcode.day12;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Neighbourhood {

    private final List<List<Integer>> hubs;

    private Set<Integer> neighbours = new HashSet<>();

    Neighbourhood(Integer origin, final List<List<Integer>> hubs) {
        this.hubs = hubs;
        add(origin);
    }

    private void add(Integer neighbour) {
        if (neighbours.contains(neighbour)) {
            return;
        }
        neighbours.add(neighbour);
        for (Integer nextNeighbour : hubs.get(neighbour)) {
            add(nextNeighbour);
        }
    }

    long size() {
        return neighbours.size();
    }

    Set<Integer> getNeighbours() {
        return neighbours;
    }
}
