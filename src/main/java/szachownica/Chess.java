package szachownica;

public class Chess {

    public void createChessboard(int width, int height) {
        for (int i = 0; i < height; i++) {
            String row = "";
            String startSign = "";
            String previousSign = "";
            for (int j = 0; j < width; j++) {
                if (j == 0) {
                    startSign = findStartSign(i);
                    row = startSign;
                    previousSign = startSign;
                } else {
                    String nextSing = getNextSing(previousSign);
                    row = row.concat(nextSing);
                    previousSign = nextSing;
                }
            }
            System.out.println(row);
        }
    }

    private String getNextSing(String previousSign) {
        if (previousSign.equals("0 ")) {
            return "1 ";
        } else {
            return "0 ";
        }
    }

    private String findStartSign(int i) {
        if (i % 2 == 1) {
            return "1 ";
        } else {
            return  "0 ";
        }
    }

    public void create(int width, int height) {
        for (int i = 0; i < height; i++) {
            String row = "";
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 0) {
                    row = row.concat("0 ");
                } else {
                    row = row.concat("1 ");
                }
            }
            System.out.println(row);
        }
    }

}
