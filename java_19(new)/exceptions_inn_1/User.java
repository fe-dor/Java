package exceptions_inn_1;

public class User {
    private String inn;
    private String name;

    public User(String inn, String name) {
        this.inn = inn;
        this.name = name;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
