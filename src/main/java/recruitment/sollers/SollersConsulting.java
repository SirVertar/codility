package recruitment.sollers;

public class SollersConsulting {
    public int solution(int[] blocks) {
        int firstFrogPosition = 0;
        int secondFrogPosition = 0;
        int maxMoves = 0;

        for (int i = 0; i < blocks.length; i++) {
            if (i == 0) {
                for (int j = 0; j < blocks.length - 1; j++) {
                    if (blocks[j] <= blocks[j + 1]) {
                        firstFrogPosition = j + 1;
                    } else {
                        break;
                    }
                }
                if (Math.abs(firstFrogPosition - secondFrogPosition) + 1 > maxMoves) {
                    maxMoves = Math.abs(firstFrogPosition - secondFrogPosition) + 1;
                }
                firstFrogPosition = 0;
                secondFrogPosition = 0;
            } else if (i == blocks.length - 1) {
                firstFrogPosition = 0;
                secondFrogPosition = 0;
                for (int j = blocks.length - 1; j > 1; j--) {
                    if (blocks[j] >= blocks[j - 1]) {
                        firstFrogPosition ++;
                    } else {
                        break;
                    }
                }
                if (Math.abs(firstFrogPosition - secondFrogPosition) + 1 > maxMoves) {
                    maxMoves = Math.abs(firstFrogPosition - secondFrogPosition) + 1;
                }
            } else {
                firstFrogPosition = 0;
                for (int j = i; j < blocks.length - 1; j++) {
                    if (blocks[j] <= blocks[j + 1]) {
                        firstFrogPosition++ ;
                    } else {
                        break;
                    }
                }
                secondFrogPosition = 0;
                for (int j = i; j > 1; j--) {
                    if (blocks[j] <= blocks[j - 1]) {
                        secondFrogPosition--;
                    } else {
                        break;
                    }
                }

                if (Math.abs(firstFrogPosition - secondFrogPosition) + 1 > maxMoves) {
                    maxMoves = Math.abs(firstFrogPosition - secondFrogPosition) + 1;
                }
            }
        }
        return maxMoves;
    }
}
