package recruitment.sollers;

public class Second {

    public String solution(int N, int K) {
        StringBuilder resultWord = new StringBuilder();
        String[] letters = new String[K];
        for (int i = 0; i < K; i++) {
            letters[i] = String.valueOf((char)(97+i));
        }
        int lettersLength = letters.length;
        int a = 0;
        if (N % 2 == 0) {
            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {
                    resultWord.insert(0, letters[(i - a) % lettersLength]);
                } else {
                    resultWord.insert(resultWord.length(), letters[(i - 1 - a) % lettersLength]);
                    a++;
                }
            }
            return resultWord.toString();
        } else {
            for (int i = 0; i < N; i++) {
                if (i == 0) {
                    resultWord.insert(0, letters[0]);
                } else if (i % 2 != 0) {
                    resultWord.insert(0, letters[(i - 1 - a) % lettersLength]);
                } else {
                    resultWord.insert(resultWord.length(), letters[(i - a - 2) % lettersLength]);
                    a++;
                }
            }
        }
        return resultWord.toString();
    }
}
