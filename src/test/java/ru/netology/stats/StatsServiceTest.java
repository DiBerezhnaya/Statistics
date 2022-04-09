package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void maxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.maxSales(sales);

        assertEquals(expected, actual);
        System.out.println("Пик продаж " + actual + " месяц");
    }

    @org.junit.jupiter.api.Test
    void minSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.minSales(sales);

        assertEquals(expected, actual);
        System.out.println("Минимум продаж " + actual + " месяц");
    }

    @Test
    void salesSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.sum(sales);

        assertEquals(expected, actual);
        System.out.println("Сумма " + actual);
    }

    @Test
    void average() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.average(sales);

        assertEquals(expected, actual);
        System.out.println("Средняя сумма " + actual);
    }


    @Test
    void countBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.countBelowAverage(sales);

        assertEquals(expected, actual);
        System.out.println("Ниже среднего " + actual + " месяцев");
    }

    @Test
    void countHigherAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 7;

        long actual = service.countHigherAverage(sales);

        assertEquals(expected, actual);
        System.out.println("Выше среднего " + actual + " месяцев");
    }
}