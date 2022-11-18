public class Main {
    public static void countYear() {
        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным ");
        } else {
            System.out.println(year + " год не является високосным ");
        }
    }

    public static void findOS() {
        int client = 0;
        int clientDeviceYear = 2015;
        if (client == 0 && clientDeviceYear >= 2015) {
            System.out.println(" Установите обычную версию приложения для IOS по ссылке ");
        } else if (client == 0 && clientDeviceYear < 2015) {
            System.out.println(" Установите облегчённую версию приложения для IOS по ссылке ");
        }
        if (client == 1 && clientDeviceYear >= 2015) {
            System.out.println(" Установите обычную версию приложения для Android по ссылке ");
        } else if (client == 1 && clientDeviceYear < 2015) {
            System.out.println(" Установите облегчённую версию приложения для Android по ссылке ");
        }
    }

    public static void countOfDays() {
        int deliveryDistance = 95;
        int day;
        if (deliveryDistance <= 20) {
            day = 1;
            System.out.println("Потребуется 1 день ");
        } else if (deliveryDistance > 20) {
            day = (deliveryDistance - 20) / 40 + 1;
            System.out.println("Потребуется " + day + " дня(ей) ");
        }
    }

    public static void main(String[] args) {
        countYear();
        findOS();
        countOfDays();
    }
}