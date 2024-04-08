package zoo.mammals;

import zoo.ISwim;
import zoo.IWalk;

public class Tiger extends Mammal implements IWalk, ISwim {

    public Tiger(double weight) {
        super(weight);
    }

    @Override
    public void move() {
        System.out.println("Тигр");
    }
    @Override
    public void swim() {
        System.out.println("Тигр плавает в воде");
    }
    @Override
    public void walk() {
        System.out.println("Тигр бегает по земле");
    }
}
