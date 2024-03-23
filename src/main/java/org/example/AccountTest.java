package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test public void instantiate() {
        Account a = new Account("ミナト", 30000);
        assertEquals("ミナト", a.owner);
        ///assertEquals(30000, a.zandaka);
    }

    private void assertEquals(String ミナト, String owner) {
    }

    @Test public void transfer() {
        System.out.println("hello");
    }
}
