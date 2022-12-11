package class_arr_2_3;

public class UniversalArr<T>{
    private final T[] arr;

    public UniversalArr(T[] arr) {
        this.arr = arr;
    }

    public T get(int i){
        return arr[i];
    }

    public static void main(String[] args) {
        String[] strings = {"aa", "ab", "ac", "ad", "ae"};
        UniversalArr<String> univArr = new UniversalArr<>(strings);
        System.out.println(univArr.get(2));
    }
}
