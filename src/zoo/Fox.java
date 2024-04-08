package zoo;

import zoo.mammals.Mammal;

public class Fox extends Mammal {
    private int sly;
    private String color;
    private String polar;

    public Fox (double weight) {
        super(weight);
    }

    public Fox (double weight, int sly, String color, String polar) {
        super(weight);
        this.sly= sly;
        this.color=color;
        this.polar=polar;
        
    }


    public int getSly() {
        return sly;
    }

    public void setSly(int sly) {
        if (sly<0)
            sly=0;
        if (sly>10)
            sly=10;
        this.sly= sly;
    }
    public String getColor(){

            return color;}


        public String getPolar(){
            return polar;
        }

    @Override
    public void move() {
        run();
    }

    public void run()
    {
        System.out.println("лиса бежит");
    }

    @Override
    public String toString() {
        return "Fox{" +
                "sly=" + sly +
                ", isAlive=" + isAlive +
                ", pawAmount=" + pawAmount +
                ", weight=" + weight +
                '}';
    }
}
