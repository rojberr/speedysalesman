package dev.drzymala.speedysalesman.algorithm.infrastructure;

import dev.drzymala.speedysalesman.algorithm.domain.City;
import dev.drzymala.speedysalesman.algorithm.domain.CityRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class MemoryCityRepository implements CityRepository {

    private Map<Long, City> cityList = new ConcurrentHashMap<>();

    @Override
    public List<City> listAll() {
        return new ArrayList<>(cityList.values());
    }

    @Override
    public void clean() {
        cityList.forEach((key, value) ->
                cityList.computeIfPresent(key, (t, s) -> (null)));
    }

    @Override
    public void save(List<City> cityList) {
        AtomicLong counter = new AtomicLong(1);
        cityList
                .stream()
                .forEach(city -> {
                    this.cityList.put(counter.getAndIncrement(), city);
                });
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(cityList.size()).append("\n");
        AtomicLong counter = new AtomicLong(1);
        this.cityList
                .forEach((id, city) -> output.append(counter.getAndIncrement()).append(" ").append(city).append("\n"));
        return String.valueOf(output);
    }
}
