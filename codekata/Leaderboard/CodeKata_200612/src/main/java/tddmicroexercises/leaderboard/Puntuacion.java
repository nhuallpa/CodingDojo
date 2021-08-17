package tddmicroexercises.leaderboard;

public class Puntuacion {
    static final Integer[] POINTS = new Integer[]{25, 18, 15};

    static Integer getPointsFor(int position) {
        return POINTS[position];
    }
}