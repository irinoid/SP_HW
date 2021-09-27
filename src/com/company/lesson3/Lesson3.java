package com.company.lesson3;

public class Lesson3 {
    public static void main(String[] args) {
        //1
        int clientOS = 1;

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке ...");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке ...");

        }
        //2
        int clientDeviceYear = 2015;
        if (clientOS == 1) {
            if (clientDeviceYear < 2019) {
                System.out.println("Установите lite-версию приложения для Android по ссылке ...");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке ...");
            }
        } else if (clientDeviceYear >= 2019) {
            System.out.println("Установите версию приложения для iOS по ссылке ...");
        } else {
            System.out.println("Установите lite-версию приложения для iOS по ссылке ...");
        }
        //3
        int year = 1300;


        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {

            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не високосный");
        }


//4
        long deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance > 20) {
            deliveryTime++;

        }

        if (deliveryDistance > 60) {
            deliveryTime++;
        }
        System.out.println("Время ожидания для клиента составит " + deliveryTime + " дня");
        //5
        int monthNumber = 10;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("неверно задан месяц, требуется число от 1 до 12");

        }
        //6
        int age = 19;
        int salary = 58_000;
        double limit = 0;

        if (age <= 23) {
            limit = salary * 2;
        } else {
            limit = salary * 3;
        }

        if (salary > 50_000 && salary < 80_000) {
            limit = limit * 1.2;
        } else if (salary > 80_000) {
            limit = limit * 1.5;
        }

        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
//7
        age = 25;
        salary = 60_000;
        int wantedSum = 330_000;
        int term = 12;
        double baseState = 10;
        double addBaseState = 0;
        double maxMonthPayment = salary / 2;
        double monthPayment = 0;
        if (age < 23) {
            baseState = baseState + 1;
        } else if (age < 30) {
            baseState = baseState + 0.5;
        }
        if (salary > 80_000) {
            baseState = baseState - 0.7;
        }

        monthPayment = wantedSum * (1 + baseState / 100) / term;
        if (wantedSum * (1 + baseState / 100) > maxMonthPayment * term) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthPayment + " рублей. Платеж по кредиту " + monthPayment + " рублей. Отказано");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthPayment + " рублей. Платеж по кредиту " + monthPayment + " рублей. Одобрено");
        }
    }
}
