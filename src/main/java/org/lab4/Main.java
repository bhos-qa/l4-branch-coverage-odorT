package org.lab4;

import java.io.File;
import java.io.IOException;

public class Main {
    static User kamran = new User("kamran", "karimov", 20, Gender.MALE, Role.ADMIN);

    public static void main(String[] args) {
        System.out.println(kamran.getName());
        System.out.println(kamran.getSurname());
        System.out.println(kamran.getAge());
        System.out.println(kamran.getFullName());
        System.out.println(kamran.getBirthYear());
        System.out.println(kamran.getGender());
        System.out.println(kamran.getRole());
    }

    void vulnerableCode() throws IOException {
        File tempDir;
        tempDir = File.createTempFile("", ".");
        tempDir.delete();
        tempDir.mkdir();
    }
}