package kick;
import java.util.Random;
import lotr.Character;

public class KingStrategy implements KickStrategy{

    @Override
    public void kick(Character whoKick, Character opponent) {
        Random random = new Random();
        int min = 0;
        int max = opponent.getHp();
        opponent.setHp(random.nextInt(max - min + 1) + min);
    }
}
