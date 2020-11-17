package course;

import java.util.Random;

public class Bunker {
    public boolean pass (){
        int chance = new Random().nextInt(6) + 1;
        return (chance >= 2);
    }
}
