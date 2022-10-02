package org.lab4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class UserTest {
    User kamran;
    User emma;

    @BeforeEach
    void setup() {
        kamran = new User("Kamran", "Karimov", 20, Gender.MALE, Role.ADMIN);
        emma = new User("Emma", "Watson", 32, Gender.FEMALE, Role.GUEST);
    }

    @Test
    void checkGetName() {
        assertEquals("Kamran", kamran.getName());
    }

    @Test
    void checkGetSurname() {
        assertEquals("Watson", emma.getSurname());
    }

    @Test
    void checkGetBirthYear() {
        assertEquals(2002, kamran.getBirthYear());
        assertEquals(1990, emma.getBirthYear());
    }

    @Test
    void setAndGetRole() {
        kamran.setRole(Role.USER);
        emma.setRole(Role.ADMIN);

        assertEquals(Role.USER, kamran.getRole());
        assertEquals(Role.ADMIN, emma.getRole());
    }

    @Test
    void checkGetGender() {
        assertEquals(Gender.MALE, kamran.getGender());
        assertEquals(Gender.FEMALE, emma.getGender());
    }
}
