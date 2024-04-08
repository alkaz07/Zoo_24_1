package zoo;

public interface IFly {
    void takeOff(String from);
    void land(String to);
    void fly(String from, String to);

    default void travelByAir(String from, String to){
        takeOff(from);
        fly(from, to);
        land(to);
    }
}
