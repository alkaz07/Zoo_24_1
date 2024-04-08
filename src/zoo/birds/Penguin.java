package zoo.birds;

import zoo.IFisherman;
import zoo.ISwim;
import zoo.IWalk;
import zoo.fishes.Fish;

public class Penguin extends Bird implements ISwim, IWalk, IFisherman {
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

    @Override
    public void walk() {
        System.out.println("пингвины ходят вперевалку");
    }

    @Override
    public double doFishing(Fish fish) {
        swim();
        if(fish.getWeight() <= this.weight*0.1)
            return fish.getWeight();
        else
            return 0;
    }
}
