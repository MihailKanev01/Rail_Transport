package rail_transport;

import java.util.HashSet;

public class Train implements Expense{
    private Locomotive locomotive;
    private HashSet<Wagon> wagons;
    private Route route;

    public Train(Locomotive locomotive, HashSet<Wagon> wagons) {
        this.locomotive = locomotive;
        this.wagons = wagons;
    }
    public void addWagons(Wagon wagon){

    }

    public Station removeWagons(Wagon wagon){
        return null;
    }

    public LocomotiveType getTrainType(){
        return null;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    @Override
    public double calculate() {
        return 0;
    }
}
