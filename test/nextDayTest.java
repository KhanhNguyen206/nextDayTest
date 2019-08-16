import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class nextDayTest {

    @Test
    void nextDaytest1(){
        int day = 1;
        int month = 1;
        int year = 2018;

        nextDay nextDay = new nextDay();
        int[] result = nextDay.nextDay(day, month, year);
        int[] expected = {2,1,2018};
        assertArrayEquals(expected, result);
    }
    @Test
    void nextDaytest2(){
        int day = 31;
        int month = 1;
        int year = 2018;

        nextDay nextDay = new nextDay();
        int[] result = nextDay.nextDay(day, month, year);
        int[] expected = {1,2,2018};
        assertArrayEquals(expected, result);
    }
    @Test
    void nextDaytest3(){
        int day = 30;
        int month = 4;
        int year = 2018;

        nextDay nextDay = new nextDay();
        int[] result = nextDay.nextDay(day, month, year);
        int[] expected = {1,5,2018};
        assertArrayEquals(expected, result);
    }
    @Test
    void nextDaytest4(){
        int day = 28;
        int month = 2;
        int year = 2018;

        nextDay nextDay = new nextDay();
        int[] result = nextDay.nextDay(day, month, year);
        int[] expected = {1,3,2018};
        assertArrayEquals(expected, result);
    }
    @Test
    void nextDaytest5(){
        int day = 29;
        int month = 2;
        int year = 2020;

        nextDay nextDay = new nextDay();
        int[] result = nextDay.nextDay(day, month, year);
        int[] expected = {1,3,2020};
        assertArrayEquals(expected, result);
    }
    @Test
    void nextDaytest6(){
        int day = 31;
        int month = 12;
        int year = 2018;

        nextDay nextDay = new nextDay();
        int[] result = nextDay.nextDay(day, month, year);
        int[] expected = {1,1,2019};
        assertArrayEquals(expected, result);
    }
}