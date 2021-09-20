package lesson7;
import java.util.Arrays;
import java.time.LocalDate;

public class Lesson7 {
    public static void main(String[] args) {
        //1
        int year = 1300;
        defineYear(year);
        //2
        int clientOS = 1;
        int clientDeviceYear = LocalDate.now().getYear();
        defineVersion(clientOS, clientDeviceYear);
        //3
        int deliveryDistance = 95;
        System.out.println("Время ожидания для клиента составит " + calculateDeliveryTime(deliveryDistance) + " дня");
        //4
        String a = "aabccddefgghiijjkk";
        //String a = "abcdefghijk";
        getDouble(a);
        //5
        int[] arr = {3, 2, 1, 6, 5};
        expandArray(arr);
        System.out.println(Arrays.toString(arr));
        //6
        int[] spendsArray = generateRandomArray();
        double average = calculateAverageSpends(spendsArray);
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
    }

    public static void defineYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void defineVersion(int clientOS, int year) {
        if (clientOS == 1) {
            if (year < 2019) {
                System.out.println("Установите lite-версию приложения для Android по ссылке ...");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке ...");
            }
        } else {
            if (year < 2019) {
                System.out.println("Установите lite-версию приложения для iOS по ссылке ...");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке ...");
            }
        }
    }

    public static int calculateDeliveryTime(int dis) {
        int time = 1;
        if (dis > 20) {
            time += 1;
            if (dis > 60) {
                time += 1;
            }
        }
        return time;
    }

    public static void getDouble(String s) {
        char[] b = s.toCharArray();
        for (int i = 0; i < (s.length() - 1); i++) {
            if (b[i] == b[i + 1]) {
                System.out.println("Дубль символа - " + b[i] + " в строке! Цикл прерван.");
                return;
            }
        }
        System.out.println("Цикл завершен. Дубли не найдены.");
    }

    public static void expandArray(int[] array) {
        int a;
        for (int i = 0; i < array.length / 2; i++) {
            a = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = a;
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static double calculateAverageSpends(int arr[]) {
        double avSpends = calculateArraySumm(arr) / arr.length;
        return avSpends;
    }

    public static int calculateArraySumm(int arr[]) {
        int summ = 0;
        for (int i : arr) {
            summ += i;
        }
        return summ;
    }
}
