package zoo.mammals;

import zoo.IFly;

public class Bat extends Mammal implements IFly {
    public Bat(double weight) {
        super(weight);
    }

    @Override
    public void move() {
        fly("", "");
    }


    @Override
    public void takeOff(String from) {
        System.out.println("Летучая мышь взлетает бесшумно");
    }

    @Override
    public void land(String to) {
        System.out.println("цепляется коготками и повисает вниз головой");
    }

    @Override
    public void fly(String from, String to) {
        System.out.println("пищит на лету, чтобы ориентироваться");
    }
}
