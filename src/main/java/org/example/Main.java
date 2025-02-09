package org.example;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию для Android по ссылке");
        } else {
            System.out.println("Установите версию для iOS по cсылке");
        }
        //Задача 2
        int clientOS_2 = 0;
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015 && clientOS_2 == 0) {
            System.out.println("Установите облегченную версию для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию для Android по ссылке");
        }
        if (clientDeviceYear >= 2015 && clientOS_2 == 0) {
            System.out.println("Установите версию для iOS по cсылке");
        } else if (clientDeviceYear >= 2015 && clientOS_2 == 1) {
            System.out.println("Установите версию для Android по cсылке");
        }
        //Задача 3
        int year = 2044;
        if (year > 1584) {//Год должен быть больше 1584
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("Год является високосным");
            } else {
                System.out.println(year + " Год не является високосным");
            }
        } else {
            System.out.println("Год должен быть больше 1584");
        }
        //Задача 4
        int deliveryDistance = 55;//Расстояние до клиента
        int days = 1;//Переменная для хранения срока доставки
        if (deliveryDistance <= 20) {
            days = 1; // Доставка в пределах 20км занимает 1 день
        } else if (deliveryDistance <= 60) {
            days = days + 1; //Доставка в пределах 20-60км занимает 2 дня
        } else if (deliveryDistance <= 100) {
            days = days + 2; //Доставка в пределах 60-100км занимает 3 дня
        } else {
            System.out.println("Доставка невозможна, расстояние превышает 100 км");
            return;
        }
        System.out.println("Потребуется дней: " + days);
        //Задача 5
        int monthNumber = 12;

        // Проверяем, является ли номер месяца корректным
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Ошибка: Некорректный номер месяца. Введите число от 1 до 12.");
            return; // Завершаем выполнение программы
        }
        String season;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                season = "зима"; // Декабрь, январь, февраль — зима
                break;
            case 3:
            case 4:
            case 5:
                season = "весна"; // Март, апрель, май — весна
                break;
            case 6:
            case 7:
            case 8:
                season = "лето"; // Июнь, июль, август — лето
                break;
            case 9:
            case 10:
            case 11:
                season = "осень"; // Сентябрь, октябрь, ноябрь — осень
                break;
            default:
                season = "неизвестно"; // Этот случай никогда не выполнится из-за проверки выше
                break;
        }
        // Выводим результат в консоль
        System.out.println("Месяц №" + monthNumber + " принадлежит к сезону: " + season);
    }
}
