package org.example;

public class Main {
    public static void main(String[] args) {
        Person dad = new PersonBuilder()
                .setName("Вадим")
                .setSurname("Волков")
                .setAge(32)
                .setAddress("Томск")
                .build();
        Person son = dad.newChildBuilder()
                .setName("Данил")
                .setAge(2)
                .build();
        System.out.println("У " + dad + " есть сын, " + son);

//        try {
//            // Не хватает обяхательных полей
//            new PersonBuilder().build();
//        } catch (IllegalStateException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            // Возраст недопустимый
//            new PersonBuilder().setAge(-100).build();
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        }


    }
}