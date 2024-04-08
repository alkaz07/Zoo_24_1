package zoo.fishes;

public class HerringKing extends Fish {
    private String color= "серебристый с ярко-красным плавником";
    private double length; // 5-11 метров

    public void swim() {
        System.out.println("Сельдяной король плывёт держа голову кверху и вращая гигантским веслообразным телом.");
//        System.out.println("Жухъ, жухъ, жухъ, жухъ, жухъ, жухъ.");
//        System.out.println("Предпочитает держаться поближе к косякам сельди");
    }

    public HerringKing(double weight, String color, double length) {
        super(weight);
        this.color = color;
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Сельдяной король: " +
                getColor() +
                ", длинна " + length +
                ", isAlive=" + isAlive +
                ", вес " + weight;

    }

    public static void exzHerringKing() {
        HerringKing hk1 = new HerringKing(200, "", 4);
        System.out.println(hk1);
    }
}