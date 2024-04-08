package zoo;

public class Helicopter implements IFly{
    String name;
    public Helicopter(String name) {
        this.name=name;
    }

    @Override
    public void takeOff(String place) {
        System.out.println("вертолет взлетает вертикально в "+place);
    }

    @Override
    public void land(String place) {
        System.out.println("вертолет зависает на месте и опускается в "+place);
    }

    @Override
    public void fly(String from, String to) {
        System.out.println("вертолет держит курс из "+from +" в "+to);
    }
}
