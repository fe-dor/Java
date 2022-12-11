package exceptions_inn_1;

import java.util.ArrayList;
import java.util.Scanner;

public class InnChecker {
    private String inn;
    private String name;

    InnChecker(Data data){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ФИО: ");
        name = sc.nextLine();
        System.out.println("Введите номер ИНН: ");
        inn = sc.nextLine();

        User user = findUser(data);
        try {
            checkInn(user);
            System.out.println("Пользователь найден");
        } catch (InnException | EmptyUserException e) {
            e.printStackTrace();
        }
    }
    public User findUser(Data data){
        for(User user : data.getUsers()){
            if(user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }
    public boolean checkInn(User user) throws InnException, EmptyUserException {
        if(user == null){
            throw new EmptyUserException("Пользователя с таким именем не существует");
        }
        if(!user.getInn().equals(inn)){
            throw new InnException("Введенный номер ИНН недействителен для клиента " + name);
        }
        return false;
    }
}
