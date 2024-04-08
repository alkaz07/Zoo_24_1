package zoo.mammals;

import zoo.ISwim;
import zoo.IWalk;

public class Capybara extends Mammal implements ISwim, IWalk {
String color;
String sex;
String typeOfFood = "травоядное";

    public Capybara(double weight, String color, String sex) {
        super(weight);
        this.color = color;
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    public String getSex() {
        return sex;
    }

    public String getTypeOfFood()  {
        return typeOfFood;
    }


    @Override
    public void move() {
        System.out.println("капибара бежит");
    }

public void swim() {
    System.out.println("капибара плывёт");
}
public void dive() {
    System.out.println("капибара ныряет");
}
public void eat(){
        this.weight += 0.5;
    System.out.println("капибара поела, теперь вес капибары " + this.weight);
}

    @Override
    public void walk() {
        System.out.println("капибара медленно идёт");
    }
}

