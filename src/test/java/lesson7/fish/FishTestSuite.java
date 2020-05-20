package lesson7.fish;

import org.junit.Test;

import static org.junit.Assert.*;

public class FishTestSuite {

    @Test
    public void test1() {
        //Given
        int[] sizeOfFishes = new int[]{4, 3, 2, 1, 5};
        int[] streamOfFish = new int[]{0, 1, 0, 0, 0};
        Fish fish = new Fish();
        //When
        int fishesWhoAreAlive = fish.solution(sizeOfFishes, streamOfFish);
        //Then
        assertEquals(2, fishesWhoAreAlive);
    }

    @Test
    public void test2() {
        //Given
        int[] sizeOfFishes = new int[]{4};
        int[] streamOfFish = new int[]{0};
        Fish fish = new Fish();
        //When
        int fishesWhoAreAlive = fish.solution(sizeOfFishes, streamOfFish);
        //Then
        assertEquals(1, fishesWhoAreAlive);
    }

    @Test
    public void test3() {
        //Given
        int[] sizeOfFishes = new int[]{4};
        int[] streamOfFish = new int[]{1};
        Fish fish = new Fish();
        //When
        int fishesWhoAreAlive = fish.solution(sizeOfFishes, streamOfFish);
        //Then
        assertEquals(1, fishesWhoAreAlive);
    }

    @Test
    public void test4() {
        //Given
        int[] sizeOfFishes = new int[]{4,5,6,7,8,9,10,1};
        int[] streamOfFish = new int[]{0,0,0,0,0,1,0,1};
        Fish fish = new Fish();
        //When
        int fishesWhoAreAlive = fish.solution(sizeOfFishes, streamOfFish);
        //Then
        assertEquals(6, fishesWhoAreAlive);
    }

}
