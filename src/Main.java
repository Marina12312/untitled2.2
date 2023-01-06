import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printIsleapYear(2023);
        checkOst(1, 2012);
        deliveryDistance(95);


    }

    private static void printIsleapYearResult(int year, boolean yearIsleap) {
        if (yearIsleap) {
            System.out.println(year + "високосный год");
        } else {
            System.out.println(year + " год не високосный ");
        }
    }

    public static void printIsleapYear(int year) {
        boolean yearIsleap = isleap(year);
        printIsleapYearResult(year, yearIsleap);
    }

    private static boolean isleap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void checkOst(int clientOst, int clientDeviceYear) {
        switch (clientOst) {
            case 0:
                if (clientDeviceYear > LocalDate.now().getYear() || clientOst == 0) {
                    System.out.println("Устоновите облегченную версию для ios");
                    return;
                } else
                    System.out.println("установите версию для ios");
                return;
            case 1:
                if (clientDeviceYear > LocalDate.now().getYear() || clientOst == 1) {
                    System.out.println(" устоновите облегченную версию для android");
                    return;
                } else
                    System.out.println(" устоновите версию для Android");
                return;
            default:
                System.out.println("ошибка");
                return;
        }
    }

    private static void deliveryDistance(int distance) {
        if (distance < 20) {
            System.out.println(" доставка займет сутки");
            return;
        } else if (distance >= 20 && distance < 60) {
            System.out.println("Доставка займет двое суток");
            return;
        } else if (distance >= 60 && distance < 100) {
            System.out.println(" Доставка займет трое суток");
        } else {
            System.out.println(" Доставки нет");
            return;
        }
    }
}









