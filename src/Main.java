public class Main {
    public static void main(String[] args) {
//        exampleRacoon();
        examplViper();
//        exampleCroc();
    }


    public static void exampleRacoon() {
        Racoon racoon = new Racoon(4, 9);
        System.out.println("У нас есть енот: "+racoon);
        racoon.move();
        racoon.die();
        System.out.println("У нас есть енот: "+racoon);
    }
    public static void  exampleRatel(){
        Ratel ratel = new Ratel(15,999);
        System.out.println("################################## ");
        ratel.move();
        ratel.bolt();
        System.out.println("Медоед: "+ratel);
    }
    public static void exampleElephant(){
        Elephant el1 = new Elephant(2000, 300);
        System.out.println("У нас объявился слон: "+el1);
        el1.move();
                System.out.println("У нас есть огромный слон: "+el1);
    }

public static void examplViper() {
    Viper vip1 = new Viper(0, 70, ": бурый ", " бесконечно.");
    vip1.move();
    System.out.println(vip1 + " Вот такая она.");
}
    public static void exampleCroc(){
        Croc croc = new Croc(1000, 7);
        System.out.println("У нас Крокодил  : "+croc);
        croc.move();
        croc.die();
        System.out.println("У нас Крокодил: "+croc);
    }

    public static void exampleCapybara(){
        Capybara capybara = new Capybara(30, "бурый", "женский");
        System.out.println("Появляется : "+capybara.getClass());
        capybara.move();
        capybara.eat();
    }
}