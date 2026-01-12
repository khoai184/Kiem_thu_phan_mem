import java.util.List;

public class StudentAnalyzer {
    public int countExcellentStudents(List<Double> scores) {
        int count = 0;
        for (Double score : scores) {
            if (score >= 8.0 && score <= 10.0) {
                count++;
            }
        }
        return count;
    }

    public double calculateValidAverage(List<Double> scores) {
        double sum = 0;
        int validCount = 0;
        for (Double score : scores) {
            if (score >= 0 && score <= 10) {
                sum += score;
                validCount++;
            }
        }
        return validCount > 0 ? sum / validCount : 0.0;
    }
}