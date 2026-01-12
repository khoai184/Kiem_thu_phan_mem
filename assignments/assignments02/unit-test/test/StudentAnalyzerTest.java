import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class StudentAnalyzerTest {
    StudentAnalyzer analyzer = new StudentAnalyzer();

    @Test
    void testCountExcellentStudents_MixedScores() {
        List<Double> scores = Arrays.asList(9.0, 7.5, 8.5, 11.0, -1.0, 8.0);
        assertEquals(3, analyzer.countExcellentStudents(scores));
    }

    @Test
    void testCountExcellentStudents_EmptyList() {
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }

    @Test
    void testCalculateValidAverage_MixedScores() {
        List<Double> scores = Arrays.asList(10.0, 8.0, 5.0, -2.0, 12.0);
        assertEquals(7.666, analyzer.calculateValidAverage(scores), 0.001);
    }

    @Test
    void testCalculateValidAverage_EmptyList() {
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()), 0.001);
    }

    @Test
    void testCalculateValidAverage_AllInvalid() {
        List<Double> scores = Arrays.asList(-1.0, 11.0, 20.0);
        assertEquals(0.0, analyzer.calculateValidAverage(scores), 0.001);
    }
}