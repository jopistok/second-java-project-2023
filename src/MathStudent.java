public class MathStudent extends Student{
    public MathStudent(String Fio, int Sem, int LastExamMark){
        super(Fio, Sem, LastExamMark); // Вызов класса-родителя
    }

    // Переопределение виртуальной функции
    @Override
    public String writeExam(int mark) {
        this.LastExamMark = mark;
        return "Студент " + this.Fio + " написал экзамен по аналитической геометрии на: " + mark;
    }
}
