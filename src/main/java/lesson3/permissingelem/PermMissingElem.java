package lesson3.permissingelem;

public class PermMissingElem {
    public int solution(int[] A) {
        int[] array = new int[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            array[A[i]-1] = A[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                return i + 1;
            }
        }
        return 0;
    }
}
