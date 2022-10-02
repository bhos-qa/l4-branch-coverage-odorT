package org.lab4;

import java.lang.reflect.Field;

public class Main {
    static User kamran = new User("kamran", "karimov", 20, Gender.MALE, Role.ADMIN);

    void getPrivateNameFieldOfUserWithReflection(User user) throws NoSuchFieldException, IllegalAccessException {
        Field name = User.class.getDeclaredField("name");

        name.setAccessible(true);

        String fieldValue = (String) name.get(user);

        System.out.println("name field from User class object" + fieldValue);
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        System.out.println(kamran.getName());
        System.out.println(kamran.getSurname());
        System.out.println(kamran.getAge());
        System.out.println(kamran.getFullName());
        System.out.println(kamran.getBirthYear());
        System.out.println(kamran.getGender());
        System.out.println(kamran.getRole());
    }
}