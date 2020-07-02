package com.account;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account account;

    @BeforeEach
    void setUp() {
        account = new Account();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void accountObjectIsNotNull() {
        assertNotNull(account);
    }

    @Test
    void accountObjectCanReceieveDepositTest() {
        account.depositMoney(1000000);
        assertEquals(1000000, account.getAccountBalance());

    }

    @Test
    void accountWillNotTakeNegativeAmountTest() {
        account.depositMoney(-1500);
        assertEquals(1000000,1000000);
    }

    @Test
    void withdrawCashWithValidPin() {
        account.depositMoney(500000);
        account.withdrawCash(50000,1234);
    }
}