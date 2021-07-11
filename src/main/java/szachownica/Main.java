package szachownica;

public class Main {
    public static void main(String[] args) {
        Chess chess = new Chess();

        chess.createChessboard(5,6);
        System.out.println();
        System.out.println();
        chess.create(5,6);
    }
}
