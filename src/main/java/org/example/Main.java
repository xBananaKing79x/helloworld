package org.example;

public class Main {
    public static void main(String[] args) {
// Первая задача
        int personAge = 16;// количество лет
        if (personAge >= 18)//Условие совершеннолетия//
        {
            System.out.println("Человек совершеннолетний");
        } else {
            System.out.println("Человеку меньше 18, он не достиг совершеннолетия, нужно немного подождать");
        }
// Вторая задача
        byte outsideWeather = 7; // Указываем температуру на улице
        if (outsideWeather <= 5) {
            System.out.println("На улице - " + outsideWeather + " , нужно надеть шапку.");
        } else {
            System.out.println("На улице - " + outsideWeather + ". Сегодня тепло, можно идти без шапки.");
        }
// Третья задача
        short actualSpeed = 50;//Указываем текущую скорость
        short speedLimit = 60;//Указываем ограничение скорости
        if (actualSpeed > speedLimit) {
            System.out.println("Скорость превышена");
        } else {
            System.out.println("Превышения скорости нет");
        }
//Четвертая задача
        byte actualAge = 2;//Указываем текущий возраст
        if (actualAge > 2 && actualAge <= 6)//Возраст хождения в ДС
        {
            System.out.println("Текущий возраст - " + actualAge + ". Надо ходить в детский сад");
        } else if (actualAge >= 7 && actualAge <= 17)//Возраст хождения в школу
        {
            System.out.println("Текущий возраст - " + actualAge + ". Надо ходить в школу");
        } else if (actualAge >= 18 && actualAge <= 24)//Возраст хождения в университет
        {
            System.out.println("Текущий возраст - " + actualAge + ". Ваше место в университете");
        } else if (actualAge > 24)//Возраст хождения на работу
        {
            System.out.println("Текущий возраст - " + actualAge + ". Бегом на завод!");
        } else {
            System.out.println("Человек еще слишком маленький, малышам надо сидеть дома с мамой.");//Вывод результата, если возраст меньше 2
        }
// Пятая задача
        byte actualAge2 = 15;//Указываем текущий возраст
        if (actualAge2 < 5)//Возраст запрета на катание
        {
            System.out.println("Текущий возраст - " + actualAge2 + ". Катание запрещено");
        } else if (actualAge2 >= 5 && actualAge2 < 14)//Условие допущения на аттракцион в сопровождении взрослого
        {
            System.out.println("Текущий возраст - " + actualAge2 + ". Можно кататься в сопровождении взрослого");
        } else if (actualAge2 >= 14)//Условие допущения на аттракцион без сопровождения
        {
            System.out.println("Текущий возраст - " + actualAge2 + ". Можно кататься без сопровождении взрослого");
        }
//Шестая задача
        byte trainPersonLimit = 45;//Указываем количество людей в вагоне
        if (trainPersonLimit <= 60) {//Условие наличия сидячих мест
            System.out.println((Object) "В Вагоне есть сидячие места");
        } else if (trainPersonLimit > 60 && trainPersonLimit <= 102) {//Условие наличия стоячих мест
            System.out.println("В Вагоне остались только стоячие места");
        } else if (trainPersonLimit > 102) {//Условие отсутствия любых мест в вагоне (стоячих или сидячих)
            System.out.println("В Вагоне нет мест");
        }
//Седьмая задача
        int one = 2;
        int two = 3;
        int three = 2;
        if (one > two && one > three) {
            System.out.println("Первое значение максимальное");
        } else if (one < two && two > three) {
            System.out.println("Второе значение максимальное");
        } else if (one < three && two < three) {
            System.out.println("Третье значение максимальное");
        } else System.out.println("Максимального значения нет");
    }
}