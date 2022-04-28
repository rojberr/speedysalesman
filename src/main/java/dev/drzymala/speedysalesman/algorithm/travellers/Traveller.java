package dev.drzymala.speedysalesman.algorithm.travellers;

import java.util.List;

public interface Traveller<T> {

    List<T> findGreedyPath();
}
