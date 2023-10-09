package lotr;
import kick.KnightStrategy;
import java.util.Random;

public class Knight extends Character{
    public Knight() {
        super(new Random().nextInt(12 - 2 + 1) + 2, new Random().nextInt(12 - 2 + 1) + 2,  new KnightStrategy());
    }
}
