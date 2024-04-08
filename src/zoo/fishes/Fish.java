package zoo.fishes;

import zoo.Animal;
import zoo.ISwim;

public abstract class Fish extends Animal implements ISwim {
    public Fish(double weight) {
        super(0,weight);
    }
    public void swim(){
        System.out.println("рыба плывет");
    }

    @Override
    public void move() {
        swim();
    }
}

