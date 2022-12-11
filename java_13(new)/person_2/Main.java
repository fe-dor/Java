package person_2;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Паращенко");
        System.out.println(person.getFullName());
        person.setName("Федор");
        System.out.println(person.getFullName());
        person.setPatronymic("Дмитриевич");
        System.out.println(person.getFullName());
    }
}
