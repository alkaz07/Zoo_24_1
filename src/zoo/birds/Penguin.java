package zoo.birds;

import zoo.ISwim;

public class Penguin extends Bird implements ISwim {
    public Penguin(String name, double weight, String featherColor) {
        super(name, weight, featherColor);
    }

    @Override
    public void move() {
        swim();
    }

    @Override
    public String scream() {
        return "по-пингвиньему";
    }

    @Override
    public void swim() {
        System.out.println("пингвин очень быстро плавает");
    }
}
