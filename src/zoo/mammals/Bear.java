package zoo.mammals;

import zoo.IFisherman;
import zoo.ISwim;
import zoo.IWalk;
import zoo.fishes.Fish;

public class Bear extends Mammal implements ISwim, IWalk, IFisherman {
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


    @Override
    public double doFishing(Fish fish) {
        System.out.println("медведь лоит рыбу на берегу реки");
        return fish.getWeight();
    }
}
