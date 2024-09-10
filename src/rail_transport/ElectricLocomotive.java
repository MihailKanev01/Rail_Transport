package rail_transport;

public class ElectricLocomotive extends Locomotive {
    public LocomotiveType getType(){
        return LocomotiveType.ELECTRIC;
    }
    public double calculate(){
        return 7.0;
    }
}
