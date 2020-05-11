package lesson1.binarygap;

public class BinaryGap {
    public int calculateBigZero (int N) {
        String binaryNumber = Integer.toBinaryString(N);
        String[] splitBinaryNumber = binaryNumber.split("1");
        int max = 0;
        int subtract = 1;
        int lastNumberInBinary = Integer.parseInt(binaryNumber.split("")[binaryNumber.length()-1]);
        if (lastNumberInBinary == 1) {
            subtract = 0;
        }
        for (int i = 0; i < splitBinaryNumber.length - subtract; i++) {
            if (splitBinaryNumber[i].length() > max) {
                max = splitBinaryNumber[i].length();
            }
        }
        return max;
    }
}
