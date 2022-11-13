public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задание №1");
        int clientOS = 1;
        if (clientOS == 0 ) {
            System.out.println("Установите версию приложения для " + " iOS " + " по ссылке ");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для " + "Android " + " по ссылке ");
        }
    }
    public static void task2(){
        System.out.println("Задание №2");
        int clientDeviceYear = 2022;
        if(clientDeviceYear > 2015){
            System.out.println("Установите приложение для iOS по ссылке");
            System.out.println("Установите приложение для Android по ссылке");
        }else if(clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию для iOS по ссылке");
            System.out.println("Установите облегченную версию для Android по ссылке");
        }
    }
    public static void task3() {
        System.out.println("Задание №3");
        int year = 2028;
        boolean leapyear = ((year > 1584 && year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
        if (leapyear) {
            System.out.println("этот год " + year + " високосный");
        } else {
            System.out.println("этот год " + year + " не високосный");
        }
    }
    }
