package sollersconsulting;

import org.junit.Test;
import recruitment.sollers.SollersConsulting;

import static org.junit.Assert.assertEquals;

public class SollersConsultingTestSuite {

    @Test
    public void test1() {
        //Given
        int[] table = new int[]{2,6,8,5};
        SollersConsulting sollersConsulting = new SollersConsulting();
        //When
        int result = sollersConsulting.solution(table);
        //Then
        assertEquals(3, result);
    }

    @Test
    public void test2() {
        //Given
        int[] table = new int[]{1,5,5,2,6};
        SollersConsulting sollersConsulting = new SollersConsulting();
        //When
        int result = sollersConsulting.solution(table);
        //Then
        assertEquals(4, result);
    }

    @Test
    public void test3() {
        //Given
        int[] table = new int[]{1,1};
        SollersConsulting sollersConsulting = new SollersConsulting();
        //When
        int result = sollersConsulting.solution(table);
        //Then
        assertEquals(2, result);
    }
}
