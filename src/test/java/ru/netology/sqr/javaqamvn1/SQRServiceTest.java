package ru.netology.sqr.javaqamvn1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCalc() {
        SQRService service = new SQRService();

        int actual = service.calcNumber(100, 300);
        int expected = 8;

        assertEquals(expected, actual);
    }


    @Test
    public void shouldCalcNew() {
        SQRService service = new SQRService();

        int actual = service.calcNumber(200, 800);
        int expected = 14;

        assertEquals(expected, actual);
    }
}