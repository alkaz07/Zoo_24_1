package zoo.reptiles;

import zoo.Animal;

public class Reptile extends Animal {
    public Reptile(4,double weight) {
        super(weight);
    }
    public Reptile(int pawAmount, double weight) {
        super(pawAmount);
        super(weight);
    }
    @Override
    public void move() {

    }
}
