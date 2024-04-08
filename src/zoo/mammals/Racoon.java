package zoo.mammals;

public class Racoon extends Mammal{
    private int impudence;

    public Racoon(double weight) {
        super(weight);
    }

    public Racoon(double weight, int impudence) {
        super(weight);
        this.impudence = impudence;
    }


    public int getImpudence() {
        return impudence;
    }

    public void setImpudence(int impudence) {
        if (impudence<0)
            impudence=0;
        if (impudence>10)
            impudence=10;
        this.impudence = impudence;
    }

    @Override
    public void move() {
        run();
    }
//
    public void run()
    {
        System.out.println("енот бежит");
    }

    @Override
    public String toString() {
        return "Racoon{" +
                "impudence=" + impudence +
                ", isAlive=" + isAlive +
                ", pawAmount=" + pawAmount +
                ", weight=" + weight +
                '}';
    }
}
