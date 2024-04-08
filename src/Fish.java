public abstract class Fish extends Animal{
    public abstract void swim();

    public Fish(int finsAmount, double weight) {
        super(weight);
        this.finsAmount = finsAmount;
        this.weight = weight;
    }

}