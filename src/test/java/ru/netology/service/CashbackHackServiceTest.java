package ru.netology.service;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void remainTest() {

        CashbackHackService CashbackHackService = new CashbackHackService();

        int amount = 900;

        int actual = CashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(actual,expected);

    }

    @org.testng.annotations.Test
    public void addAmountTest() {

        CashbackHackService CashbackHackService = new CashbackHackService();

        int amount = 100;

        int actual = CashbackHackService.remain(amount);
        int expected = 900;

        assertEquals(actual,expected);

    }

    @org.testng.annotations.Test
    public void notAddAmountTest() {

        CashbackHackService CashbackHackService = new CashbackHackService();

        int amount = 1000;

        int actual = CashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual,expected);

    }

}