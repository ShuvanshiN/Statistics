package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[ ] sales) {
    int sum = 0;
    for (int sale : sales) {
    sum = sum + sale;
    }
    return sum;
    }

    public int findAvq(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int findMax(int[] sales) {
        int maxMonth = sales[0];
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;

    }

    public int findMin(int[] sales) {
        int minMonth = sales[0];
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int NumberOfMonthsInWhichSalesWereBelowAverage(int[] sales) {
        int monthsAmount = 0;
        int sum =0;
        for (int monthSale : sales) {
            sum += monthSale;
        }
        for (int monthSale : sales) {
            if (monthSale < findAvq(sales)) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;
 }
    public int NumberOfMonthsInWhichSalesWereAboveAverage(int[] sales) {
        int monthsAmount = 0;
        int sum =0;
        for (int monthSale : sales) {
            sum += monthSale;
        }
        for (int monthSale : sales) {
            if (monthSale > findAvq(sales)) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;
    }
}

