public class IUStudent extends Student{
    public IUStudent(String Fio, int Sem, int LastExamMark){
        super(Fio, Sem, LastExamMark); // Вызов класса-родителя
    }

    // Переопределение виртуальной функции
    @Override
    public String writeExam(int mark) {
        this.LastExamMark = mark;
        return "Студент " + this.Fio + " написал экзамен по программированию на: " + mark;
    }
}
