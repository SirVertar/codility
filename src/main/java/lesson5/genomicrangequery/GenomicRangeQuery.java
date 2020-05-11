package lesson5.genomicrangequery;

import java.util.Arrays;

public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {

        int[] result = new int[P.length];
        StringBuilder stringBuilder = new StringBuilder().append(S);


        if (S.split("G").length == 0) {
            Arrays.fill(result, 3);
            return result;
        } else if (S.split("A").length == 0) {
            Arrays.fill(result, 1);
            return result;
        } else if (S.split("C").length == 0) {
            Arrays.fill(result, 2);
            return result;
        } else if (S.split("T").length == 0) {
            Arrays.fill(result, 4);
            return result;
        }

        int minImpact = 4;
        int position = 0;
        String word = "";
        for (int i = 0; i <= Q.length-1; i++) {
            word = S.substring(P[position], Q[position]+1);
            System.out.println(word);
            if (word.matches(".*A.*")) {
                minImpact = 1;
            } else if (word.matches(".*C.*")) {
                    minImpact = 2;
            } else if (word.matches(".*G.*")) {
                    minImpact = 3;
            }
            result[position] = minImpact;
            minImpact = 4;
            position++;
        }
        return result;
    }
}
