package zoo.mammals;

import zoo.IBuild;
import zoo.ISwim;
import zoo.IWalk;

public class Beaver extends Mammal implements ISwim, IWalk, IBuild {
    private String rase;
    private String color;

//    public Beaver(double weight) {
//        super(weight);
//    }
    public Beaver(double weight,String rase,String color) {
        super(weight);
        this.color=color;
        this.rase=rase;
    }


    @Override
    public void move() {
       swim();
       walk();

    }

    @Override
    public void swim() {
        System.out.println("Бобер может плавать и нырять");

    }

    @Override
    public void walk() {
        System.out.println("Бобер ходит проворно, стуча хвостом");

    }

    @Override
    public void build() {
        System.out.println("Бобер строит хаты из деревьев");

    }
    public String ToString() {
        return "Бобер" +
                "Цвет" + color +
                "Порода" + rase +
                "живой" + isAlive +
                "Ног " + pawAmount +
                "Вес" + weight;
    }
}
