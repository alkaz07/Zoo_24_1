package zoo.mammals;

import zoo.ISwim;
import zoo.IWalk;

public class Tapir extends Mammal implements ISwim, IWalk {

    public Tapir(double weight) {
        super(weight);
    }

    //@Override
    public void move() {
        tapirMove();
    }

    public void tapirMove() {
        System.out.println("Тапир вальяжно движется на 4-х лапах");

    }
    //@Override
public void makeSound() {
    System.out.println("Тапир очень голоден");
}

    @Override
    public void swim() {
        System.out.println("Тапир очень медлено плывет");
    }

    @Override
    public void walk() {
        System.out.println("Тапир медлено идет");

    }
}


