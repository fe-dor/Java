package n3;

import mylist.MyList;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(9);
        myList.add(10);
        myList.add(11);
        myList.add(12);

        for (int i = 0; i < 10; i++){
            System.out.println(myList.pop());
        }
    }
}
