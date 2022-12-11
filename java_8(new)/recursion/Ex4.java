package recursion;

public class Ex4 {

    public static int sum(int num) { // Считает сумму цифр числа.
        if(num == 0)
            return 0;
        return num%10 + sum(num/10);
    }

    public static int howMuch(int k, int s, int z) { // Сравнивает сумму цифр всех k-значных чисел с s.
        if(z <= Math.pow(10, k) - 1) {
            if (s == sum(z))
                return 1 + howMuch(k, s, 1 + z);
            else
                return howMuch(k, s, 1 + z);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(howMuch(3, 20, 100)); // z - наименьшее k-значное число.
    }
}
