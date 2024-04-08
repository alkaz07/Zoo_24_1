package zoo.fishes;

import zoo.ISwim;

public class Tang extends Fish implements ISwim {

    public Tang(double weight) {
        super(weight);
    }

    @Override
    public void swim() {
        System.out.println("Тан плывет очень быстро");
    }
}
