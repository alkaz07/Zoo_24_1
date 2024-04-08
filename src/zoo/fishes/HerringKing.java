package zoo.fishes;

public class HerringKing extends Fish{
    private String color; // серебристый с ярко-красным плавником
    private String length; // 5-11 метров
    public HerringKing(double weight) {
        super(weight);
    }
    public void swim(){
        System.out.println("Плавает держа голову кверху и вращая гигантским веслообразным телом.");
        System.out.println("Предпочитает держаться поближе к косякам сельди");
    }
}
