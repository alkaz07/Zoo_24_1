public class Ratel extends Mammal{
    private int impudence;

    public Ratel(double weight) {
        super(weight);
    }

    public Ratel(double weight, int impudence) {
        super(weight);
        this.impudence = impudence;
    }

    public int getImpudence() {
        if (impudence<0)
            impudence=0;
        if (impudence>1000)
            impudence=1000;
        return impudence;
    }

    public void setImpudence(int impudence) {
        this.impudence = impudence;
    }

    @Override
    public void move() {
        System.out.println("Медоед не спешит");
    }
    public  void bolt(){
        System.out.println("Медоед кладёт на всех");
    }

    @Override
    public String toString() {
        return "Ratel{" +
                "impudence=" + impudence +
                ", isAlive=" + isAlive +
                ", pawAmount=" + pawAmount +
                ", weight=" + weight +
                '}';
    }
}
