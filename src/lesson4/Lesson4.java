package lesson4;

public class Lesson4 {
    public static void main(String[] args) {
        //1
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = i - 1; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //2
        int firstFridayDay = 6;
        for (int a = firstFridayDay; a <= 31; a += 7) {
            System.out.println("Сегодня пятница, " + a + "-ое число. Необходимо подготовить отчет.");
        }
        //3
        int currYear = 2021;
        int lastYear = currYear - 200;
        int futureYear = currYear + 100;
        for (i = lastYear; i < futureYear; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
        //4
        for (i = 1; i <= 30; i++) {
            System.out.print(i + ":");
            if (i % 3 == 0) {
                System.out.print(" ping");
            }
            if (i % 5 == 0) {
                System.out.print(" pong");
            }
            System.out.println();
        }
//5
        int a = 0;
        System.out.print(" " + a);
        int b = 1;
        int c = 0;
        System.out.print(" " + b);
        for (i = 1; i <= 8; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
