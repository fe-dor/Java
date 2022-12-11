package project;

public class Ex6 {
    public static void main(String[] args) {
        ThrowsDemo1 throwsDemo1 = new ThrowsDemo1();
        throwsDemo1.printMessage(null);
    }
}
class ThrowsDemo1 {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public String getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            return "data for" + key;
        } catch (NullPointerException e){
            System.out.println("Empty key");
            return null;
        }
    }
}
