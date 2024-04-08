package zoo.birds;

public class Parrot extends Bird {
    private String speech;

    public Parrot(String featherColor, double weight, String scream, String speech)
    {
        super(featherColor,weight,scream);
        this.speech=speech;
    }

    public void repeatSpeech(){}

    @Override
    public void move() {

    }

    @Override
    public String scream() {
        return speech;
    }
}