public abstract class Student {
    public static String Fio; // Фамилия
    public static int Sem; // Семестр обучения
    public static int LastExamMark; // Оценка за последний экзамен

    public Student(String Fio, int Sem, int LastExamMark){
        if (Sem < 1 | Sem > 12) throw new RuntimeException("Неверно введен семестр обучения студента");
        if (LastExamMark < 0 | LastExamMark > 5) throw new RuntimeException("Неверно введена оценка за последний экзамен");
        this.Fio = Fio;
        this.Sem = Sem;
        this.LastExamMark = LastExamMark;
    }

    abstract String writeExam(int mark); // Виртуальная функция
}
