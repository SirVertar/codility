package lesson7.fish;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Fish {
    public int solution(int[] A, int[] B) {
        int fish = 0;
        int winningFishStream = -1;
        int winningFishSize = -1;
        List<Integer> downStreamWinnersSize = new LinkedList<>();
        if (A.length == 1) {
            return 1;
        }
        for (int i = 0; i < A.length; i++) {
            if (winningFishStream == -1) {
                if (B[i] == 0) {
                    fish++;
                    continue;
                } else if (B[i] == 1) {
                    winningFishSize = A[i];
                    winningFishStream = B[i];
                    continue;
                }
            }
            if (winningFishStream == B[i] && B[i] == 0) {
                winningFishSize = A[i];
                winningFishStream = B[i];
                fish++;
            } else if (winningFishStream == B[i] && B[i] == 1) {
                downStreamWinnersSize.add(0, winningFishSize);
                winningFishSize = A[i];
                winningFishStream = B[i];
            } else if (B[i] == 1 && winningFishSize < A[i]) {
                winningFishSize = A[i];
                winningFishStream = B[i];
            } else if (B[i] == 0 && winningFishSize < A[i]) {
                winningFishSize = A[i];
                winningFishStream = B[i];

                boolean noFishesFromDownStreamToFight = downStreamWinnersSize.size() == 0;
                while (!noFishesFromDownStreamToFight) {
                    if (downStreamWinnersSize.get(0) < winningFishSize) {
                        downStreamWinnersSize.remove(0);
                        if (downStreamWinnersSize.size() == 0) {
                            noFishesFromDownStreamToFight = true;
                        }
                    } else {
                        winningFishSize = downStreamWinnersSize.get(0);
                        winningFishStream = 1;
                        downStreamWinnersSize.remove(0);
                        noFishesFromDownStreamToFight = true;
                    }
                }
            }
        }
        if (winningFishSize != -1) {
            fish++;
        }
        fish = fish + downStreamWinnersSize.size();
        return fish;
    }
}
