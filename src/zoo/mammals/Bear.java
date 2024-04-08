package zoo.mammals;

import zoo.ISwim;
import zoo.IWalk;

public class Bear extends Mammal implements ISwim, IWalk {
    public Bear(double weight){
        super(weight);
    }

    @Override
    public void move() {
        walk();
    }

    @Override
    public void swim() {
        System.out.println("плывет за лососем");
    }

    @Override
    public void walk() {
        System.out.println("косолапо топает");
    }
    public void roar() {
        System.out.println("страшно рычит р-р-р!");
    }
}
