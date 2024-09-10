package rail_transport;

public class SteamLocomotive extends Locomotive{
    public LocomotiveType getType(){
        return LocomotiveType.STEAM;
    }
    public double calculate(){
        return 9.6;
    }
}
