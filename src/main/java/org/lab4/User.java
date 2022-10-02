package org.lab4;

import java.util.Calendar;

public class User {
    private String name;
    private String surname;

    private final Gender gender;

    private int age;

    private Role role;
    User(String name, String surname, int age, Gender gender, Role role) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getBirthYear() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - this.age;
    }
}
