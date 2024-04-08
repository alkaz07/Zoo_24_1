package zoo.fishes;

public class Fugu extends Fish {
    double length;
    int toxicity;

    public Fugu(double weight, double length, int toxicity) {
        super(weight);
        this.length = length;
        this.toxicity = toxicity;
    }

    public double getLength() {
        return length;
    }

    public int getToxicity() {
        return toxicity;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public void setToxicity(int toxicity) {
        this.toxicity = toxicity;
    }

    public Fugu(double weight) {
        super(weight);
    }

    public void protect(){
        System.out.println(this.getClass() + "выпускает шипы");
    }

}
