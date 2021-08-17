package tddmicroexercises.leaderboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Leaderboard {

    private final List<Race> races;

    public Leaderboard(Race... races) {
        this.races = Arrays.asList(races);
    }

    public Map<String, Integer> driverResults() {
        Map<String, Integer> results = new HashMap<>();
        for (Race race : this.races) {
            for (Driver driver : race.getResults()) {
                String driverName = race.getDriverName(driver);
                int points = race.getPoints(driver);
                results.put(driverName, results.getOrDefault(driverName,0) + points);
            }
        }
        return results;
    }

    public List<String> driverRankings() {
        Map<String, Integer> results = driverResults();
        List<String> resultsList = results.keySet().stream()
                .sorted(comparingByDriverPoints(results))
                .collect(Collectors.toList());

        return resultsList;

    }

    private Comparator<String> comparingByDriverPoints(Map<String, Integer> results) {
        return (driverName1, driverName2) -> -results.get(driverName1).compareTo(results.get(driverName2));
    }

}
