package tddmicroexercises.leaderboard;

public class SelfDrivingCar extends Driver {

    private String algorithmVersion;

    public SelfDrivingCar(String algorithmVersion, String company) {
        super(algorithmVersion, company);
        this.algorithmVersion = algorithmVersion;
    }

    public String getDriverName() {
        return "Self Driving Car - " + getCountry() + " (" + getAlgorithmVersion() + ")";
    }

    public String getAlgorithmVersion() {
        return algorithmVersion;
    }

    public void setAlgorithmVersion(String algorithmVersion) {
        this.algorithmVersion = algorithmVersion;
    }

}
