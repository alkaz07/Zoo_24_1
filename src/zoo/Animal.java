package zoo;

public abstract class Animal {

    protected boolean isAlive = true;
    protected int pawAmount;
    protected double weight;



    public abstract void move();



    public Animal(int pawAmount, double weight) {
        this.pawAmount = pawAmount;
        this.weight = weight;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getPawAmount() {
        return pawAmount;
    }

    public void setPawAmount(int pawAmount) {
        this.pawAmount = pawAmount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void die(){
        if(isAlive)
        {
            System.out.println(this +" погибло");
            isAlive = false;
        }
        else
            System.out.println("То что мертво, умереть не может");


    }

    @Override
    public String toString() {
        return  this.getClass().getName()+ "{" +
                "isAlive=" + isAlive +
                ", pawAmount=" + pawAmount +
                ", weight=" + weight +
                '}';
    }
}
