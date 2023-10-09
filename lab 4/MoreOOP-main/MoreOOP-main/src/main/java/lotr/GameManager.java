package lotr;
class GameManager {
    void fight(Character c1, Character c2) {
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            if (c2.isAlive()) {
                c2.kick(c1);
            }
        }
    }
}