package zoo.mammals;
import zoo.ISwim;
import zoo.IWalk;
public class Rabbyt extends Mammal implements ISwim, IWalk {
    public Rabbyt(double weight) {
        super(weight);
    }
    @Override
    public void move() {
        System.out.println();
    }
    @Override
    public void swim() {
        System.out.println();
    }
    @Override
    public void walk() {
        System.out.println();
    }
}