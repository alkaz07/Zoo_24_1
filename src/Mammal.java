public abstract class Mammal extends Animal{
    public Mammal( double weight) {
        super(4, weight);
    }

    public void feedBabies(){
        System.out.println(this+" кормит детенышей молоком");
    }

}
