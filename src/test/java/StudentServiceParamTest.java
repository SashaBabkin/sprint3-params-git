import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StudentServiceParamTest {

    public int score;
    public String expected;

    public StudentServiceParamTest(int score, String expected) {
        this.score = score;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][] {
                {90, "Молодец!!!"},
                {75, "Хорошо, но можно лучше!"},
                {37, "Средний результат."},
                {15, "Плохой результат!"},
                {-500, "Неизвестный результат"}
        };
    }

    @Test
    public void checkScore() {
        StudentService service = new StudentService();
        String actual = service.checkStudentScore(score);
        assertEquals("ТЕСТ УПАЛ", expected, actual);
    }

}
