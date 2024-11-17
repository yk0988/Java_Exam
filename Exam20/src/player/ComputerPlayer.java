package player;
import java.util.Random;

public class ComputerPlayer extends Player {
    private static Random rand;

    static {
        rand = new Random();
    }

    // --- 손 결정 ---
    public int nextHand() {
        return rand.nextInt(3);
    }
}