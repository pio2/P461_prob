package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test public void instantiate() {
        Account a = new Account("ミナト", 30000);
        assertEquals("ミナト", a.owner);
        assertEquals(30000, a.zandaka);
    }
    @Test public void transfer() {
        Account b = new Account("ミナト", 30000);
        Account c = new Account("yamada", 100000);
        b.transfer(c, 5000);
        boolean ans = (b.zandaka == (30000 - 5000));
        boolean ans2 = (c.zandaka == (100000 + 5000));
        System.out.println(ans);
        System.out.println(ans2);

    }
}
