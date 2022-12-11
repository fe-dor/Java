package numbers_4.min_max;

public class MinMax<T extends Comparable<T>> {
    private final T[] arr;

    public MinMax(T[] arr) {
        this.arr = arr;
    }

    public T getMin(){
        T temp = arr[arr.length - 1];
        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i].compareTo(temp) < 0){
                temp = arr[i];
            }
        }
        return temp;
    }
    public T getMax(){
        T temp = arr[arr.length - 1];
        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i].compareTo(temp) > 0){
                temp = arr[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Animal(5, "Lion");
        animals[1] = new Animal(7, "Dog");
        animals[2] = new Animal(1, "Pigeon");
        animals[3] = new Animal(3, "Elephant");
        animals[4] = new Animal(6, "Eagle");
        MinMax<Animal> mm = new MinMax<>(animals);
        System.out.println(mm.getMax());
        System.out.println(mm.getMin());
    }
}
