package zoo.birds;

import zoo.IFly;

public class Lark extends Bird implements IFly {

    public Lark(String featherColor) {
        super(featherColor);
    }

    @Override
    public void move() {
        System.out.println("Жаворонки умеют прыгать");
    }



    @Override
    public void takeOff(String from) { System.out.println("Жаворонок взлетает очень рано утром");

    }

    @Override
    public void land(String to) { System.out.println("Посадка для жаворонка плёвое дело");

    }

    @Override
    public void fly(String from, String to) { System.out.println("Жаворонки умеют очень высоко летают");

    }

    @Override
    public String scream() {System.out.println("Жаворонки не орут как все, а прекрасно поют");

        return null;
    }
}

