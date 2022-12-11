package mathAndRandom.formater.report;

public class Test {
    public static void main(String[] args) {
        Employee[] employers = new Employee[2];
        employers[0] = new Employee("Паращенко Федор Дмитриевич", 1000);
        employers[1] = new Employee("Иванов Иван Иванович", 2000);
        Report.generateReport(employers);
    }
}
