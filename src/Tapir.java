public class Tapir extends Mammal {

    public Tapir(double weight) {
        super(weight);
    }

    //@Override
    public void move() {
        tapirMove();
    }

    public void tapirMove() {
        System.out.println("Тапир вальяжно движется на 4-х лапах");

    }
    //@Override
public void makeSound() {
    System.out.println("Тапир очень голоден");
}
}


