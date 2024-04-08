package zoo.mammals;

import zoo.IFly;
import zoo.IWalk;
import zoo.ISwim;
import zoo.IFisherman;
import zoo.fishes.Fish;


    public class Fox extends Mammal implements IFly, ISwim,IWalk, IFisherman{
        String name;
        public Fox (double weight, String n) {
            super (weight);
            this.name=n;
        }

        @Override
        public void takeOff(String place) {
            System.out.println("лиса взлетает в прыжке"+place);
        }

        @Override
        public void land(String place) {
            System.out.println("лиса прыгает в воздухе, а затем опускается в "+place);
        }

        @Override
        public void fly(String from, String to) {
            System.out.println("лиса летит из "+from +" в "+to);
        }





        @Override
        public double doFishing(Fish fish) {
            System.out.println(" лиса ловит рыбу ныряя за ней");
            if (fish.getWeight()<=this.weight * 0.75)
                return fish.getWeight();
            else
                return 0;
        }

        @Override
        public void swim() {

        }

        @Override
        public void walk() {

        }

        @Override
        public void move() {
            walk();
        }
    }



