package rail_transport;

public class Station {
    private Station name;
    private Town town;
    private Coordinate coordinate;

    public Station(Station name, Town town, Coordinate coordinate) {
        this.name = name;
        this.town = town;
        this.coordinate = coordinate;
    }

    public Station getName() {
        return name;
    }

    public Town getTown() {
        return town;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }
}
