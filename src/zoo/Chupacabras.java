package zoo;

public class Chupacabras extends Animal implements IWalk,IFly,ISwim{

    private int hunger; private final int name;

    public Chupacabras(int pawAmount, double weight, int hunger, int name) {
        super(4, weight);
        this.name=name;
        if (hunger>10) this.hunger=10;
        if (hunger<0) this.hunger=0;
        if (hunger>=0 && hunger<=10) this.hunger = hunger;
    }

    @Override
    public void move() {
        chupaMoovin();
    }
    public void chupaMoovin (){
        System.out.println("Чупакабра передвигается прыжками на всех 4 конечностях");

    }
    public double hunt(Animal a){
        if (a.weight<=40) {
            System.out.println("Чупакабра охотится на "+a.getClass().getName()+" охота успешна");
            return this.weight+=a.weight/3;
        }
        else System.out.println("Чупакабра охотится на "+a.getClass().getName()+" охота окончилась неудачей");
        return this.weight-=3.5;
    }

    @Override
    public String toString() {
        return "Чупакабра{" +
                " №" + name +
                " весит " + weight +
                " и очень голодна " + hunger +
                '}';
    }

    @Override
    public void walk() {
        System.out.println("Чупакабра сгорбившись ходит на ногах");
    }

    @Override
    public void takeOff(String from) {
        System.out.println("Чупакабра прыгает с возвышенности ("+from+")");
    }

    @Override
    public void land(String to) {
        System.out.println("Чупакабра складывает перепонки и падает в "+to);
    }

    @Override
    public void fly(String from, String to) {
        System.out.println("С помощью кожаных перепонок между телом и верхними лапами чупакабра планирует с "+from+ " и снижается в "+to);
    }

    @Override
    public void swim() {
    System.out.println("С помощью перепонок между пальцами чупакабра плавает");
    }
}
