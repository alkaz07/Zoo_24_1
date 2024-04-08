public class Viper extends Animal {
    private String color;
    private String aggressiveness;



    @Override
    public void move() {
        System.out.println("Гадюка ползёт.");
    }

    public String getColor() {
        color="бурый";
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        color="бурый";
    }

    public String getAggressiveness() {
        aggressiveness = "не знает краёв";
        return aggressiveness;
    }

    public void setAggressiveness(String aggressiveness) {
        this.aggressiveness = aggressiveness;
        aggressiveness = "не знает краёв";
    }

    public Viper(int pawAmount, double weight, String color, String aggressiveness) {
        super(pawAmount, weight);
        this.color = color;
        this.aggressiveness = aggressiveness;
    }

    @Override
    public String toString() {
        return "Гадюка " +"цвет" + color +
                "агрессивность" + aggressiveness +
                ", isAlive=" + isAlive +
                ", количество ног " + pawAmount +" штук"+
                ", вес " + weight +"грамм.";
    }
    public void examplViper(){
        Viper vip1=new Viper(this.pawAmount, this.weight, this.color,this.aggressiveness);
        System.out.println("Выползает гадюка "+vip1+" Вот такая она.");
    }
}
//TODO
//расширить функционал
//Гадюка не в состоянии отличить опасное от безопасного — она кидается на всё. Это очень агрессивная змея.