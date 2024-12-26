package ru.netology.stats;

public class StatsService {
    public long calculateTotalSales(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) { //8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
            totalSales += sale;
        }
        return totalSales;
    }

    public long calculateAverageSales(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        long averageSales = totalSales / 12;
        return averageSales;
    }

    public int getMonthMaxSale(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    public int getMonthMinimumSale(long[] sales) {
        int monthMinimum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinimum]) {
                monthMinimum = i;
            }
        }
        return monthMinimum + 1;
    }

    public int calculateMonthsBelowAverage(long[] sales) {
        int count = 0;
        long averageSale = calculateAverageSales(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                count++;
            }
        }
        return count;
    }

    public int calculateMonthsAboveAverage(long[] sales) {
        int count = 0;
        long averageSale = calculateAverageSales(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                count++;
            }
        }
        return count;
    }

}