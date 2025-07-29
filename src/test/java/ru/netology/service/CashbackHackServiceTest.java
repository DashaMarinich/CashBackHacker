package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    public void remainTest() {

        CashbackHackService CashbackHackService = new CashbackHackService();

        int amount = 900;

        int actual = CashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(expected,actual);


       }
}