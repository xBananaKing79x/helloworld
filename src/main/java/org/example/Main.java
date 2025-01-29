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
        var boxer_1 = 78.2;
        var boxer_2 = 82.7;
        var boxers_sum = boxer_1 + boxer_2;
        System.out.println(boxers_sum);
        var boxers_diff = Math.abs(boxer_1 - boxer_2);
        System.out.println(boxers_diff);
        var boxers_max = Math.max(boxer_1, boxer_2);
        var boxers_min = Math.min(boxer_1, boxer_2);
        var boxers_div = boxers_max % boxers_min;
        System.out.println(boxers_div);
        var time_limit = 640;
        var person_limit = 8;
        var persons_count = time_limit / person_limit;
        System.out.println("Всего работников в компании - " + persons_count);
        persons_count = persons_count + 94;
        var new_time_limit = person_limit * persons_count;
        System.out.println("Если в компании работает " + persons_count + " сотрудника, то всего " + new_time_limit + " часов работы может быть поделено между сотрудниками.");

    }
}