package tddmicroexercises.leaderboard;

import java.util.Arrays;
import java.util.List;

public class Race {

    private final String name;
    private final List<Driver> results;

    public Race(String name, Driver... drivers) {
        this.name = name;
        this.results = Arrays.asList(drivers);
    }

    public int position(Driver driver) {
        return this.results.indexOf(driver);
    }

    public int getPoints(Driver driver) {
        return Puntuacion.getPointsFor(position(driver));
    }

    public List<Driver> getResults() {
        return results;
    }

    public String getDriverName(Driver driver) {
        return driver.getDriverName();
    }

    @Override
    public String toString() {
        return name;
    }
}
