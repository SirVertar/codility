package lesson3.frogjmp;

public class FrogJump {
    public int solution(int X, int Y, int D) {
        if ((Y-X) % D == 0) {
            return (Y-X) / D;
        } else {
            return (Y-X) / D + 1;
        }
    }
}
