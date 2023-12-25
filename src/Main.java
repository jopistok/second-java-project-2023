public class Main {
    public static void main(String[] args) {
        /*
        Студент ИУ
         */
        IUStudent Andrew = new IUStudent("Ракитин Андрей Петрович", 1, 4); // Создание объекта определенного класса
        System.out.println(Andrew.writeExam(4)); // Проверка работы метода
        System.out.println(Andrew.LastExamMark); // Проверка изменения атрибутов после выполнения метода
        /*
        Студент ФН
         */
        MathStudent Andrew2 = new MathStudent("Семенов Андрей Алексеевич", 1, 3);
        System.out.println(Andrew2.writeExam(5));// Аналогичные проверки
        System.out.println(Andrew2.LastExamMark);
    }
}