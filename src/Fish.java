public abstract class Fish extends Animal {
    public Fish(double weight) {
        super(0,weight);
    }
    public void swim(){
        System.out.println("рыба плывет");
    }

    @Override
    public void move() {
        swim();
    }
}

