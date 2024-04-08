package zoo.mammals;

import zoo.IFly;
import zoo.ISwim;
import zoo.IWalk;

public class Elephant extends Mammal implements ISwim, IWalk {

    private int power;

    public Elephant(double weight) {
        super(weight);
    }

    public Elephant(double weight, int power) {
        super(weight);
        this.power = power;
    }

    @Override
    public void move() {
        System.out.println("Огромный слон топает, земля трясется");
    }
    public void waterShower(){
        System.out.println("Слон обливается водой");
    }
    public void logsTakeup(int logs){
                System.out.println("Слон поднимает бревна в количестве "+logs+" шт");
    }

    @Override
    public void swim() {
        System.out.println("Слон отличный пловец, способен проплыть до 50 км");
    }

    @Override
    public void walk() {
        System.out.println("Слон гуляет сам по себе");
    }
}
