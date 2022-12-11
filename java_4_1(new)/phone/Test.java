package phone;

public class Test {
    public static void main(String[] args) {
        Phone phone = new Phone("+79184516167", "s1");
        Phone phone1 = new Phone("+79184516177", "m3");
        Phone phone2 = new Phone("+79184516112", "xs");

        System.out.println(phone);
        System.out.println(phone1);
        System.out.println(phone2);

        phone.receiveCall("+79898008700");
        phone1.receiveCall("+79898008701");
        phone2.receiveCall("+79898008702");

        phone.getNumber();
        phone1.getNumber();
        phone2.getNumber();

        phone.receiveCall("+79898008700", "Fedor");

        phone1.sendMessage(new String[]{"+79898008700", "+79898008704", "+79898008701"});
    }
}
