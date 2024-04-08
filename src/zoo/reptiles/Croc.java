package zoo.reptiles;

import zoo.Animal;
import zoo.ISwim;

public class Croc extends Reptile implements ISwim {
    private int agility;

    public Croc (double weight) {
        super(4, weight);
    }

    public Croc (double weight, int agility) {
        super(4, weight);
        this.agility= agility;
    }


    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        if (agility<0)
            agility=0;
        if (agility>10)
            agility=10;
        this.agility= agility;
    }




    public void move() {System.out.println("Крокодил плывет");}

    public String toString() {
        return "Croc{" +
                "impudence=" + agility +
                ", isAlive=" + isAlive +
                ", pawAmount=" + pawAmount +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void swim() {
        System.out.println("плывущий крокодил похож на бревно");
    }
}