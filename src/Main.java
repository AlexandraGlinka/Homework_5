public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        char clientOS = 0; //0 — iOS, 1 — Android
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2() {
        System.out.println("Задача 1");
        char clientOS = 1; //0 — iOS, 1 — Android
        int clientDeviceYear = 2014;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int year = 2500;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("Год является високосным");
            } else {
            System.out.println("Год не является високосным");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 59;
        int deliveryTime = 1;
        if (deliveryDistance < 20) {
            //deliveryTime = deliveryTime;
        } else if (deliveryDistance < 60) {
            deliveryTime += 1;
        } else if (deliveryDistance < 100) {
            deliveryTime += 2;
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
        System.out.println("Потребуется дней: " + deliveryTime);
    }
    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 4;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + " - это зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " - это весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " - это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " - это осень");
                break;
            default:
                System.out.println(monthNumber + " - такого месяца не существует");
        }
    }
}