package zoo.fishes;

public class Tang extends Fish {

    public Tang(double weight) {
        super(weight);
    }

    @Override
    public void swim() {
        System.out.println("Тан плывет очень быстро");
    }
}
