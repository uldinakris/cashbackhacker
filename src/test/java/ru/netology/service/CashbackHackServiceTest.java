package ru.netology.service;

public class CashbackHackServiceTest {
        public CashbackHackService cashbackHackService = new CashbackHackService();

        @org.junit.Test
        public void shouldSuggestAmountToCashback() {
            int expected = 300;
            int actual = cashbackHackService.remain(700);
            org.junit.Assert.assertEquals(expected, actual);
        }

        @org.junit.Test
        public void shouldSuggestAmountToCashbackOverThousand() {
            int expected = 900;
            int actual = cashbackHackService.remain(1100);
            org.junit.Assert.assertEquals(expected, actual);
        }

        @org.junit.Test
        public void shouldSuggestAmountToCashbackEqualThousand() {
            int expected = 0;
            int actual = cashbackHackService.remain(1000);
            org.junit.Assert.assertEquals(expected, actual);
        }

}