package rail_transport;

import java.util.List;

public class Route {
    private List<Station> stations;
    private Station currentStation;
    private Station nextStationsIndex;

    public Route(Station startStation) {
        this.currentStation = startStation;
    }

    public Station getCurrentStation() {
        return currentStation;
    }

    public Station getNextStation(){
        return nextStationsIndex;
    }

    public boolean hasNextStation(){
        return true;
    }
}
