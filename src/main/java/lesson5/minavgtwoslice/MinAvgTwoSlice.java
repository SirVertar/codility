package lesson5.minavgtwoslice;

public class MinAvgTwoSlice {
    public int solution(int[] A) {
        double lowestSlice = 0.0;
        int beginIndexOfTheLowestSlice = 0;

        for (int i = 0; i < A.length - 1; i++) {
            double temp = 0.0;
            int divider = 2;
            for (int j = i; j < A.length - 1; j++) {
                if (i == 0 && j == i) {
                    temp = ((double) A[j] + A[j + 1]);
                    lowestSlice = temp / 2;
                    divider++;
                } else if (i == j) {
                    if ((((double) A[j] + A[j + 1]) / divider) < lowestSlice) {
                        beginIndexOfTheLowestSlice = i;
                        temp = (A[j] + A[j + 1]);
                        lowestSlice = temp / divider;
                        divider++;
                    } else {
                        temp = (A[j] + A[j + 1]);
                        divider++;
                    }
                } else if (((temp + A[j + 1]) / divider) < lowestSlice) {
                    beginIndexOfTheLowestSlice = i;
                    temp = (temp + A[j + 1]);
                    lowestSlice = temp / divider;
                    divider++;
                } else {
                    temp = (temp + A[j + 1]);
                    divider++;
                }
            }
        }
        return beginIndexOfTheLowestSlice;
    }
}
