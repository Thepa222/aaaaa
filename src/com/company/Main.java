package com.company;

public class Main {

    public static void main(String[] args) {
	Student s = new Student();
    s.setAge(18);
    s.setName("Denis");
        System.out.println(s.isAdult());
        Student c = new Student();
        c.setAge(15);
        c.setName("Anton");
        System.out.println(c.isAdult());

    }

}
