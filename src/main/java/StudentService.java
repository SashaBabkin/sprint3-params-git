public class StudentService {

    public String checkStudentScore(int score) {
        if (score >= 90) {
            return "Молодец!!!";
        }
        if (score >= 50) {
            return "Хорошо, но можно лучше!";
        }
        if (score >= 20) {
            return "Средний результат.";
        }
        if (score < 20 && score > 0) {
            return "Плохой результат!";
        }
        return "Неизвестный результат";
    }
}
