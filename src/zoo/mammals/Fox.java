package zoo.mammals;

import zoo.IFly;
import zoo.mammals.Mammal;

public class Fox extends Mammal implements IFly {
public class Fox extends Mammal {
    private int sly;
    private String color;
    private String polar;

    public Fox (double weight) {
        super(weight);
    }

    public Fox (double weight, int sly, String color, String polar) {
        super(weight);
        this.sly= sly;
        this.color=color;
        this.polar=polar;
        
    }


    public int getSly() {
        return sly;
    }

    public void setSly(int sly) {
        if (sly<0)
            sly=0;
        if (sly>10)
            sly=10;
        this.sly= sly;
    }
    public String getColor(){

            return color;}


        public String getPolar(){
            return polar;
        }

    @Override
    public void move() {
        run();
    }

    public void run()
    {
        System.out.println("лиса бежит");
    }

    @Override
    public String toString() {
        return "Fox{" +
                "sly=" + sly +
                ", isAlive=" + isAlive +
                ", pawAmount=" + pawAmount +
                ", weight=" + weight +
                '}';
    }
}
public interface IFly {
    public class Fox implements IFly, ISwim,IWalk {
        String name;
        public Fox (double weight) {super (weight) String name) {
            this.name=name;
        }

        @Override
        public void takeOff(String place) {
            System.out.println("лиса взлетает в прыжке"+place);
        }

        @Override
        public void land(String place) {
            System.out.println("лиса прыгает в воздухе, а затем опускается в "+place);
        }

        @Override
        public void fly(String from, String to) {
            System.out.println("лиса летит из "+from +" в "+to);
        }
    }
    void takeOff(String from);
    void land(String to);
    void fly(String from, String to);

    default void travelByAir(String from, String to){
        takeOff(from);
        fly(from, to);
        land(to);
    }
}


public interface ISwim {
    public void swim();
}

public interface IWalk {
    //функциональный интерфейс - содержит всего 1 метод
    void walk();
}
