public class Main {
    public static void main(String[] args) {
        task1();
        //task2();
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
}