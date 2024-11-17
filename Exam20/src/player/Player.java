package player;

public abstract class Player {
    int hand; // (0:가위/1:바위/2:보)
    public abstract int nextHand(); // 다음 손
}
