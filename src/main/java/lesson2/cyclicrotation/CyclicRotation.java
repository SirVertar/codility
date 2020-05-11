package lesson2.cyclicrotation;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int[] array = new int[A.length];
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            array[(i+K) % arrayLength] = A[i];
        }
        return array;
    }
}
