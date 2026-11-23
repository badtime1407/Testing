public class GradeCalculator {
    private static final int[] MIN_SCORES = {80, 75, 70, 65, 60, 55, 50};
    private static final String[] GRADES = {"A", "B+", "B", "C+", "C", "D+", "D"};

    public String gradeOf(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100: " + score);
        }
        for (int i = 0; i < MIN_SCORES.length; i++) {
            if (score >= MIN_SCORES[i]) {
                return GRADES[i];
            }
        }
        return "F";
    }
}
