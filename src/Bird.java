abstract public class Bird extends Animal {
    String featherColor;
    // Определяем цвет пернатых.
    public Bird(String featherColor) {
        this.featherColor = featherColor;
    }
    // Определяем имя, массу пернатых.
    public Bird(String name, double weight, String featherColor) {
        super(name, weight);
        this.featherColor = featherColor;
    }

    // Определение криков пернатых.
    public abstract String scream();

    @Override
    public void makeSound() { // Определение звуков пернатых.
        System.out.println(scream());

    }
}