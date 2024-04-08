package zoo.birds;
import

import static java.nio.file.Files.walk;

interface IWalk ;

//Класс, описывающий страуса.
public class Ostrich extends Bird implements IWalk {

    public Ostrich() {
        super("черно-белый");
    }

    public Ostrich(String name, double weight, String featherColor) {
        super(name, weight, featherColor);
    }

    @Override
    public void move() {
        walk();
        System.out.println("Страусы отлично прыгают и бегают.");
    }

    @Override
    public String scream() {
        return "кричит по-страусиному";
    }

   // @Override
    public void jump() {
        System.out.println("Страусы очень хорошо прыгают");
    }

}