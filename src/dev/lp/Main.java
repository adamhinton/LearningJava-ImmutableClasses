package dev.lp;

public class Main {
    public static void main(String[] args) {


        Person jane = new Person();
        jane.setName("Jane");

        Person jim = new Person();
        jane.setName("Jim");

        Person joe = new Person();
        jane.setName("Joe");

        Person john = new Person();
        jane.setName("John");
        john.setDob("05/05/1900");

        jane.setKids(new Person[]{jane, jim, joe});
        System.out.println(john);


    }
}