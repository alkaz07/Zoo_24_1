package zoo.reptiles;

import zoo.Animal;

public class Reptile extends Animal {
    public Reptile(double weight) {
        super(4, weight);
    }
    public Reptile(int pawAmount, double weight) {
        super(pawAmount, weight);
    }
    @Override
    public void move() {

    }
}
