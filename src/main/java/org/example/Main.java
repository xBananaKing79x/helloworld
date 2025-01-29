package org.example;

public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend - 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxersSum = boxer1 + boxer2;
        System.out.println(boxersSum);
        var boxersDiff = Math.abs(boxer1 - boxer2);
        System.out.println(boxersDiff);
        var boxersMax = Math.max(boxer1, boxer2);
        var boxersMin = Math.min(boxer1, boxer2);
        var boxersDiv = boxersMax % boxersMin;
        System.out.println(boxersDiv);
        var timeLimit = 640;
        var personLimit = 8;
        var personsCount = timeLimit / personLimit;
        System.out.println("Всего работников в компании - " + personsCount);
        personsCount = personsCount + 94;
        var newTimeLimit = personLimit * personsCount;
        System.out.println("Если в компании работает " + personsCount + " сотрудника, то всего " + newTimeLimit + " часов работы может быть поделено между сотрудниками.");

    }
}