package exceptions_inn_1;

import java.util.ArrayList;

public class Data {
    private ArrayList<User> users;

    public Data() {
        users = new ArrayList<>();
        getUsersFromDataBase();
    }

    public void getUsersFromDataBase(){
        User user1 = new User("7894525874", "Паращенко Федор Дмитриевич");
        User user2 = new User("6934565428", "Иванов Иван Иванович");
        User user3 = new User("7236575361", "Петров Иван Петрович");
        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
