package lesson5;

import java.util.Arrays;

public class Lesson5 {
    public static void main(String[] args) {
        // 1
        int[] arr = generateRandomArray();
        int summ = 0;
        for (int i : arr) {
            summ += i;
        }
        System.out.println("Сумма трат за месяц составила " + summ + " рублей.");
        //2
        //Arrays.sort(arr);
        //System.out.println("Минимальная сумма трат за день составила " + arr[0] + " рублей. Максимальная сумма трат за день составила " + arr[arr.length - 1] + " рублей.");
        int minDaySpends = arr[0];
        int maxDaySpends = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < minDaySpends) {
                minDaySpends = arr[i];

            }
            if (arr[i] > maxDaySpends) {
                maxDaySpends = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minDaySpends + " рублей. Максимальная сумма трат за день составила " + maxDaySpends + " рублей.");
        //3
        double average = summ / arr.length;

        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
        //4
        char a;
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
        //5
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[matrix.length - 1 - i][i] = 1;
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        //6
        int[] arr1 = {5, 4, 3, 2, 1};
        int[] arr2 = new int[5];
        for (int i = arr1.length; i > 0; i--) {
            arr2[arr1.length - i] = arr1[i - 1];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        //7
        System.out.println("Массив задача 7 [1]: " + Arrays.toString(arr1));
        int buf;
        for (int i = 0; i < arr1.length / 2; i++) {
            buf = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = buf;
        }
        System.out.println("Массив задача 7 [2]: " + Arrays.toString(arr1));
//8
        int[] arr3 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(arr3);
        int ii = 0;
        int jj = arr3.length - 1;
        while (ii < (arr3.length - 1)) {
            if ((arr3[ii] + arr3[jj]) < -2) {
                ii++;
            } else if ((arr3[ii] + arr3[jj]) > -2) {
                jj--;
            } else {
                System.out.println("Задача 8: " + arr3[ii] + " " + arr3[jj]);
                break;
            }
        }
        //9
        System.out.println("Задача 9: ");
        for (int i = 0; i < arr3.length; i++) {
            for (int j = i + 1; j < arr3.length; j++) {
                if (arr3[i] + arr3[j] == -2) {
                    System.out.println(arr3[i] + " " + arr3[j]);
                }
            }
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
}
