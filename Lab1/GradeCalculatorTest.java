import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GradeCalculatorTest {
    private GradeCalculator calc;

    @Before
    public void setUp() {
        calc = new GradeCalculator();
    }

    @Test
    public void score80And100ShouldReturnA() {
        assertEquals("A", calc.gradeOf(80));
        assertEquals("A", calc.gradeOf(100));
    }

    @Test
    public void score75And79ShouldReturnBPlus() {
        assertEquals("B+", calc.gradeOf(75));
        assertEquals("B+", calc.gradeOf(79));
    }

    @Test
    public void score70And74ShouldReturnB() {
        assertEquals("B", calc.gradeOf(70));
        assertEquals("B", calc.gradeOf(74));
    }

    @Test
    public void score65And69ShouldReturnCPlus() {
        assertEquals("C+", calc.gradeOf(65));
        assertEquals("C+", calc.gradeOf(69));
    }

    @Test
    public void score60And64ShouldReturnC() {
        assertEquals("C", calc.gradeOf(60));
        assertEquals("C", calc.gradeOf(64));
    }

    @Test
    public void score55And59ShouldReturnDPlus() {
        assertEquals("D+", calc.gradeOf(55));
        assertEquals("D+", calc.gradeOf(59));
    }

    @Test
    public void score50And54ShouldReturnD() {
        assertEquals("D", calc.gradeOf(50));
        assertEquals("D", calc.gradeOf(54));
    }

    @Test
    public void score0And49ShouldReturnF() {
        assertEquals("F", calc.gradeOf(0));
        assertEquals("F", calc.gradeOf(49));
    }

    @Test(expected = IllegalArgumentException.class)
    public void scoreMinus1ShouldThrowIllegalArgumentException() {
        calc.gradeOf(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void score101ShouldThrowIllegalArgumentException() {
        calc.gradeOf(101);
    }
}
