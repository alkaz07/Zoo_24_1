package zoo.birds;

import zoo.IFly;
import zoo.ISwim;
import zoo.IWalk;
import zoo.birds.Bird;

public class Duck extends Bird implements IFly, ISwim, IWalk {
    public Duck(String featherColor, double weight, String scream) {
        super(featherColor, weight, scream);
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }

    @Override
    public void takeOff(String from) {

    }

    @Override
    public void land(String to) {

    }

    @Override
    public void fly(String from, String to) {

    }

    @Override
    public void move() {

    }

    @Override
    public String scream() {
        return null;
    }

    @Override
    public void swim() {

    }

    @Override
    public void walk() {

    }
}

