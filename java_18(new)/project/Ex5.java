package project;

public class Ex5 {
    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.getDetails(null);
    }
}
class ThrowsDemo {
    public void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        }
        catch (NullPointerException e){
            System.out.println("Empty key");
        }
        key = key + "1";
    }
}