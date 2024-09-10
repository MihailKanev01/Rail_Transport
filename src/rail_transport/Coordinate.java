package rail_transport;

public class Coordinate {
    private double longitude;
    private double latitude;
    private double radiusOfEarth = 6371.0;

    public Coordinate(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double getDistance(Coordinate coordinate) {
        return (2 * Math.asin(
                Math.sqrt(
                        Math.sin(
                                Math.pow(
                                        Math.abs(
                                                (coordinate.latitude - this.latitude) / 2
                                        ), 2
                                )
                        ) + Math.cos(this.longitude) * Math.cos(coordinate.longitude) * Math.sin(
                                Math.pow(
                                        Math.abs(
                                                (coordinate.longitude - this.longitude) / 2
                                        ), 2
                                )
                        )
                )
        )) * this.radiusOfEarth;
    }
}
