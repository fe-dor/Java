package person_2;

public class Person {
    private String name = "";
    private String surname;
    private String patronymic = "";

    Person(String surname){
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getFullName(){
        StringBuilder sb = new StringBuilder(surname);
        if (!name.isEmpty() || !patronymic.isEmpty()){
            sb.append(" ");
        }
        if (!name.isEmpty()){
            sb.append(name.substring(0,1).toUpperCase());
            sb.append(".");
        }
        if (!patronymic.isEmpty()){
            sb.append(patronymic.substring(0,1).toUpperCase());
            sb.append(".");
        }
        return sb.toString();
    }
}
