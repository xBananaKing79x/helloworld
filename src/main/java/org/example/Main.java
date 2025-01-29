package org.example;

public class Main {
    public static void main(String[] args) {
        int cars = 999;
        byte apples = 64;
        short messages = -18567;
        long messagesLong = 3456789L;
        float timeLeft = 3.5f;
        double messagesDouble = 3.456787654;
        System.out.println("Значение переменной " + "cars " + "с типом " + ((Object) cars).getClass().getSimpleName() + " равно " + cars);
        System.out.println("Значение переменной " + "apples " + "с типом " + ((Object) apples).getClass().getSimpleName() + " равно " + apples);
        System.out.println("Значение переменной " + "messages " + "с типом " + ((Object) messages).getClass().getSimpleName() + " равно " + messages);
        System.out.println("Значение переменной " + "messagesLong " + "с типом " + ((Object) messagesLong).getClass().getSimpleName() + " равно " + messagesLong);
        System.out.println("Значение переменной " + "timeLeft " + "с типом " + ((Object) timeLeft).getClass().getSimpleName() + " равно " + timeLeft);
        System.out.println("Значение переменной " + "messagesDouble " + "с типом " + ((Object) messagesDouble).getClass().getSimpleName() + " равно " + messagesDouble);

        float boats = 27.12f;
        long boatsLong = 987678965549L;
        short boats2 = 2786;
        short boats3 = 569;
        short boats4 = -159;
        short boats5 = 27897;
        byte boats6 = 67;
        System.out.println("Значение переменной " + "boats " + "с типом " + ((Object) boats).getClass().getSimpleName() + " равно " + boats);
        System.out.println("Значение переменной " + "boats2 " + "с типом " + ((Object) boats2).getClass().getSimpleName() + " равно " + boats2);
        System.out.println("Значение переменной " + "boats3 " + "с типом " + ((Object) boats3).getClass().getSimpleName() + " равно " + boats3);
        System.out.println("Значение переменной " + "boats4 " + "с типом " + ((Object) boats4).getClass().getSimpleName() + " равно " + boats4);
        System.out.println("Значение переменной " + "boats5 " + "с типом " + ((Object) boats5).getClass().getSimpleName() + " равно " + boats5);
        System.out.println("Значение переменной " + "boats6 " + "с типом " + ((Object) boats6).getClass().getSimpleName() + " равно " + boats6);

        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        short paperNumber = 480;
        float paperPerStudent = (float) paperNumber / (studentsLP + studentsAS + studentsEA);
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги.");

        byte productivityPerMinute = 8;
        System.out.println("За 20 минут машина произвела " + productivityPerMinute * 20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + productivityPerMinute * 60 * 24 + " штук бутылок");
        System.out.println("За сутки машина произвела " + productivityPerMinute * 60 * 24 * 3 + " штук бутылок");
        System.out.println("За сутки машина произвела " + productivityPerMinute * 60 * 24 * 31 + " штук бутылок");

        // Общее количество банок краски
        int totalPaintCans = 120;
        // Количество банок краски на один класс
        int whitePerClass = 2;   // Белая краска
        int brownPerClass = 4;   // Коричневая краска
        // Общее количество банок краски на один класс
        int totalPerClass = whitePerClass + brownPerClass;
        // Вычисляем количество классов
        int numberOfClasses = totalPaintCans / totalPerClass;
        // Вычисляем количество банок каждой краски
        int whitePaintCans = numberOfClasses * whitePerClass;
        int brownPaintCans = numberOfClasses * brownPerClass;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + whitePaintCans + " банок белой краски и " + brownPaintCans + " коричневой краски");

        byte bananaWeight = 80; // Вес одного банана
        byte milkWeight = 105; // Вес 100мл молока
        byte icecreamWeight = 100; // Вес одного брикета мороженого
        byte eggWeight = 70; // Вес одного яйца
        // Вычисляем вес коктейля на завтрак (в гр.)
        int totalweight = (5 * bananaWeight) + (2 * milkWeight) + (2 * icecreamWeight) + (4 * eggWeight);
        // Вычисляем вес коктейля на завтрак (в кг.)
        float grPerKG = 1000;
        float totalWeightKG = (totalweight / grPerKG);
        System.out.println("Вес коктейля в граммах равен " + totalweight + " грамм.");
        System.out.println("Вес коктейля в килограммах равен " + totalWeightKG + " киллограмм");
        // Исходные данные
        double totalWeightLossKg = 7; // Общий вес, который нужно сбросить (в кг)
        double minDailyLossKg = 0.25; // Минимальная суточная потеря веса (в кг)
        double maxDailyLossKg = 0.5;  // Максимальная суточная потеря веса (в кг)

        // Переводим килограммы в граммы для удобства
        int totalWeightLossGrams = (int) (totalWeightLossKg * 1000); // 7 кг = 7000 г
        int minDailyLossGrams = (int) (minDailyLossKg * 1000);       // 0.25 кг = 250 г
        int maxDailyLossGrams = (int) (maxDailyLossKg * 1000);       // 0.5 кг = 500 г

        // Вычисляем количество дней для минимальной и максимальной потери веса
        int daysForMinLoss = (int) Math.ceil((double) totalWeightLossGrams / minDailyLossGrams);
        int daysForMaxLoss = (int) Math.ceil((double) totalWeightLossGrams / maxDailyLossGrams);

        // Вычисляем среднее количество дней
        double averageDays = (daysForMinLoss + daysForMaxLoss) / 2.0;

        // Выводим результаты
        System.out.println("Количество дней при потере 250 грамм в день: " + daysForMinLoss);
        System.out.println("Количество дней при потере 500 грамм в день: " + daysForMaxLoss);
        System.out.println("Среднее количество дней для достижения результата: " + averageDays);

        // Исходные данные: текущие зарплаты сотрудников
        double mashaSalary = 67760;  // Зарплата Маши
        double denisSalary = 83690; // Зарплата Дениса
        double kristinaSalary = 76230; // Зарплата Кристины

        // Процент повышения зарплаты
        double raisePercentage = 0.10;

        // Расчет для Маши
        double newMashaSalary = mashaSalary * (1 + raisePercentage); // Новая зарплата
        double mashaAnnualBefore = mashaSalary * 12; // Годовой доход до повышения
        double mashaAnnualAfter = newMashaSalary * 12; // Годовой доход после повышения
        double mashaDifference = mashaAnnualAfter - mashaAnnualBefore; // Разница

        // Расчет для Дениса
        double newDenisSalary = denisSalary * (1 + raisePercentage);
        double denisAnnualBefore = denisSalary * 12;
        double denisAnnualAfter = newDenisSalary * 12;
        double denisDifference = denisAnnualAfter - denisAnnualBefore;

        // Расчет для Кристины
        double newKristinaSalary = kristinaSalary * (1 + raisePercentage);
        double kristinaAnnualBefore = kristinaSalary * 12;
        double kristinaAnnualAfter = newKristinaSalary * 12;
        double kristinaDifference = kristinaAnnualAfter - kristinaAnnualBefore;

        // Вывод результатов
        System.out.println("Маша:");
        System.out.println("Теперь получает " + newMashaSalary + " рублей");
        System.out.println("Годовой доход вырос на " + mashaDifference + " рублей");
        System.out.println("Денис:");
        System.out.println("Теперь получает " + newDenisSalary + " рублей");
        System.out.println("Годовой доход вырос на " + denisDifference + " рублей");
        System.out.println("Кристина:");
        System.out.println("Теперь получает " + newKristinaSalary + " рублей");
        System.out.println("Годовой доход вырос на " + kristinaDifference + " рублей");
    }
}