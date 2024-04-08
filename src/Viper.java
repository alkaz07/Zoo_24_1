public class Viper extends Animal {
    private String color;
    private String aggressiveness;



    @Override
    public void move() {
        System.out.println("Гадюка ползёт.");
    }

    public String getColor() {
        color="бурого";
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        color="бурого";
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


    public void examplViper(){
        Viper vip1=new Viper(this.pawAmount, this.weight, this.color,this.aggressiveness);
        System.out.println("Выползает гадюка "+vip1+" Вот такая она.");
    }
    @Override
    public String toString() {
        return "Гадюка " + getColor() +" цвета" +
                ", агрессивность " + getAggressiveness() +
                ", isAlive=" + isAlive +
                ", количество ног " + pawAmount +" штук"+
                ", вес " + weight +"грамм.";
    }
}
//TODO
//расширить функционал
//Гадюка не в состоянии отличить опасное от безопасного — она кидается на всё. Это очень агрессивная змея.