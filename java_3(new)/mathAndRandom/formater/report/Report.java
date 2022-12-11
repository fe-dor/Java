package mathAndRandom.formater.report;

public class Report {
    public static void generateReport(Employee[] employers){

        for (int i = 0; i < employers.length; i++){
            System.out.println(String.format("%30.2f" ,employers[i].getSalary()));
        }
    }
}
