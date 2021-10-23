package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(enterpriseSales);
       assertEquals(expected, actual);
    }

    @Test
    void shouldFindAvg() {
        StatsService service = new StatsService();
        int[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.findAvq(enterpriseSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMax() {
        StatsService service = new StatsService();
        int[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMax(enterpriseSales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldFindMin() {
        StatsService service = new StatsService();
        int[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findMax(enterpriseSales);
        assertEquals(expected, actual);
    }
    @Test
    void numberOfMonthsInWhichSalesWereBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.numberOfMonthsInWhichSalesWereBelowAverage(sales);

        assertEquals(expected, actual);
    }
    @Test
    void numberOfMonthsInWhichSalesWereAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.numberOfMonthsInWhichSalesWereBelowAverage(sales);

        assertEquals(expected, actual);
    }
}