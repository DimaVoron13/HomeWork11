import java.time.LocalDate;

public class Main {

    public static void calculationLeapYear(int yearCount) {
        if (yearCount % 4 == 0 && yearCount % 100 != 0 || yearCount % 400 == 0) {
            System.out.println("Этот год является високосным");
        } else {
            System.out.println("Этот год не является високосным");
        }
    }

    public static void searchVersionForOS(int ClientOSCount, int clientDeviceYearCount) {
        int IOS = 0;
        int Android = 1;
        if (ClientOSCount == IOS && clientDeviceYearCount >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (ClientOSCount == IOS && clientDeviceYearCount < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (ClientOSCount == Android && clientDeviceYearCount >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (ClientOSCount == Android && clientDeviceYearCount < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int calculationDeliveryDays(int deliveryDistanceCount) {
        if (deliveryDistanceCount <= 20) {
            return 1;
        } else if (deliveryDistanceCount > 20 && deliveryDistanceCount <= 60) {
            return 2;
        } else if (deliveryDistanceCount > 60 && deliveryDistanceCount <= 100) {
            return 3;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println("Задание 1");
        int year = 804;
        calculationLeapYear(year);

        System.out.println("Задание 2");
        int ClientOS = 1;
        int clientDeviceYear = LocalDate.now().getYear();
        searchVersionForOS(ClientOS, clientDeviceYear);

        System.out.println("Задание 3");
        int deliveryDistance = 8;
        int days = calculationDeliveryDays(deliveryDistance);
        if (days > 0) {
            System.out.println("Для доставки с расстоянием в " + deliveryDistance + " км, потребуется " + days + " суток");
        } else {
            System.out.println("Для расстояния в " + deliveryDistance + " км, доставки нет");
        }
    }
}