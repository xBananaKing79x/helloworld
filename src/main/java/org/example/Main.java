package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int monthlySavings2 = 15000;//Указываем сумму, которую будем откладывать
        double totalSavings2 = 0; //Указываем начальную сумму
        double annualInterestRate = 0.12;//Годовая процентная ставка
        double monthlyInterestRate = annualInterestRate / 12;//Месячная ставка
        int month = 1;
        while (totalSavings2 < 2_459_000) {//Условие завершения цикла
            totalSavings2 += monthlySavings2;
            totalSavings2 += (totalSavings2 * monthlyInterestRate);
            System.out.println("Месяц " + month + " сумма накоплений равна " + totalSavings2);
            month++;
        }
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Задача 3");
        int population = 12000000;
        double birthRatePer1000 = 17;
        double deathRatePer1000 = 8;
        int years = 10;
        // Получаем коэффициенты рождаемости и смертности
        double birthRate = birthRatePer1000 / 1000;
        double deathrate = deathRatePer1000 / 1000;
        //Рассчитываем численность населения
        for (int year = 1; year <= years; year++) {
            double births = population * birthRate; //Количество новорожденных
            double deaths = population * deathrate; //Количество смертей
            population += (births - deaths);
            //Выводим результат текущего года
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
        System.out.println("Задача 4");
        int deposit = 15000;
        double depositInterestRate = 0.07;
        int depositMonth = 1;
        while (deposit < 12000000) {
            deposit += (deposit * depositInterestRate);
            System.out.println("Месяц " + depositMonth + " сумма накоплений - " + deposit);
            depositMonth++;
        }
        System.out.println("Задача 5");
        double deposit2 = 15000;
        double depositInterestRate2 = 0.07;
        int depositMonth2 = 0;
        while (deposit2 <= 12000000) {
            depositMonth2++;
            deposit2 += (deposit2 * depositInterestRate2);
            if (depositMonth2 % 6 != 0) {
                continue;
            }
            System.out.println("Месяц " + depositMonth2 + " сумма накоплений - " + deposit2);
        }
        System.out.println("Задача 6");
        double deposit3 = 15000;
        double depositInterestRate3 = 0.07;
        int monthInHalfYear = 6;
        int totalyears = 9;
        int totalmonths = totalyears * 12;
        int halfYearCounter = 1;
        for (int month2 = 1; month2 < totalmonths; month2++) {
            deposit3 += (deposit3 * depositInterestRate3);
            //Проверяем прошло ли полгода
            if (month2 % monthInHalfYear == 0) {
                System.out.println("Номер полугодия " + halfYearCounter + " сумма накоплений = " + deposit3);
                halfYearCounter++;
            }
        }
        System.out.println("Задача 7");
        // Число, выпадающее на первую пятницу месяца (от 1 до 7)
        int firstFriday = 1; // Например, первая пятница — 1-е число
        // Выводим сообщение для каждой пятницы месяца
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println("Задача 8");
        int currentYear = 2025;
        // Год начала и конца периода расчета
        int startYear = currentYear - 200; // 200 лет назад
        int endYear = currentYear + 100;  // 100 лет вперед
        // Первый год появления кометы
        int firstAppearance = 0;
        // Цикл для вычисления лет появления кометы
        for (int year = firstAppearance; year <= endYear; year += 79) {
            if (year >= startYear) { // Выводим только годы в заданном диапазоне
                System.out.println(year);
            }
        }
    }
}
