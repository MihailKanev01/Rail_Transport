package rail_transport;

public class DieselLocomotive extends Locomotive{
    public LocomotiveType getType(){
        return LocomotiveType.DIESEL;
    }
    public double calculate(){
        return 8.5;
    }
}
