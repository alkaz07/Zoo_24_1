package zoo.fishes;

public class Fugu extends Fish {


    public Fugu(double weight) {
        super(weight);
    }

    public void protect(){
        System.out.println(this.getClass() + "выпускает шипы");
    }

}
