package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
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

    public int numberOfMonthsInWhichSalesWereBelowAverage(int[] sales) {
        int avg = findAvq(sales);
        int monthCount = 0;
        for (int sale : sales) {
            if (sale < findAvq(sales)) {
                monthCount += 1;
            }
        }
        return monthCount;
 }
    public int numberOfMonthsInWhichSalesWereAboveAverage(int[] sales) {
        int avg = findAvq(sales);
        int monthCount = 0;
        for (int sale : sales) {
            if (sale < findAvq(sales)) {
                monthCount += 1;
            }
        }
        return monthCount;
}
}

