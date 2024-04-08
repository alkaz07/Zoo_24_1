public class Tapir extends Mammal {
    int weight = 150;
    int paws = 4;
    String name = "Pusha";
    void displayInfo(){
        System.out.println(name);
    }

    public Tapir(String name, int weight, int paws) {
        super(name, weight);
        this.weight = weight;
        this.paws = paws;
        this.name = name;
    }

    @Override
    public void move() {

    }

    @Override
    public void makeSound() {

    }
}
