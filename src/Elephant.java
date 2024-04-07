public class Elephant extends Mammal{

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
}
