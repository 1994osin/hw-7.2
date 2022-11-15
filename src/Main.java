import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        // Task 1
        int monthlyExpenses = 0;
        for (int j : arr) {
            monthlyExpenses += j;
        }
        System.out.println("Сумма трат за месяц составила " + monthlyExpenses + " рублей");

        // Task 2
        int minAmount = arr[0];
        int maxAmount = arr[0];
        for (int j : arr) {
            if (minAmount > j) minAmount = j;
            if (maxAmount < j) maxAmount = j;
        }
        System.out.println("Минимальная сумма трат за день составила " + minAmount + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxAmount + " рублей");

        // Task 3
        monthlyExpenses = 0;
        float averageAmount = 0;
        for (int j : arr) {
            monthlyExpenses += j;
        }
        averageAmount = (float) monthlyExpenses / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей");

        // Task 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}