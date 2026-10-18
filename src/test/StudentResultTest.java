package test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentResultTest {

    private final StudentResult result = new StudentResult();

    @Test
    void shouldCalculateTotal() {
        int total = result.calculateTotal(80, 90, 70);

        assertEquals(240, total);
    }

    @Test
    void shouldCalculateAverage() {
        double average = result.calculateAverage(240);

        assertEquals(80.0, average, 0.001);
    }

    @Test
    void shouldReturnGradeB() {
        String grade = result.getGrade(80.0);

        assertEquals("B", grade);
    }

    @Test
    void shouldReturnFailForLowAverage() {
        String grade = result.getGrade(30.0);

        assertEquals("Fail", grade);
    }
}
