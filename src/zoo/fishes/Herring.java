package zoo.fishes;

public class Herring extends Fish{

    public Herring(double weight) {
        super(weight);
    }

    @Override
    public void swim() {
        System.out.println("Сельдь плавает большими косяками для защиты от хищников ");
    }

    @Override
    public String toString() {
        return "Сельдь {}";
    }
}
