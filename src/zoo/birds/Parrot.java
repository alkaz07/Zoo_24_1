package zoo.birds;

import zoo.IFly;
import zoo.IWalk;

public class Parrot extends Bird implements IFly , IWalk {
    @Override
    public void walk() {
        System.out.println( "ходит вразвалочку");
    }

    private String speech;

    public Parrot(String featherColor, double weight, String scream, String speech)
    {
        super(featherColor,weight,scream);
        this.speech=speech;
    }

    public void repeatSpeech(){
        // Попугай повторяет слова
    }

    @Override
    public void move() {
        travelByAir("A", "B");
    }

    @Override
    public String scream() {
        return speech;
    }

    @Override
    public void takeOff(String from) {
        System.out.println("хлоп-хлоп попугай взлетает в "+from);
    }

    @Override
    public void land(String to) {
        System.out.println("попугай хватается лапами за подходящую опору в "+to);
    }

    @Override
    public void fly(String from, String to) {
        System.out.println("попугай летит напрямую из "+from+" в "+to);
    }
}

