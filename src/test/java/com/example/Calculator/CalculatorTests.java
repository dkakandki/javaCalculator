package com.example.Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorTests {

    Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    void adding_two_numbers() {
        int a = 10;
        int b = 5;

        int result = calculator.add(a, b);
        Assertions.assertEquals(15, result);
    }

    @Test
    void adding_two_numbers_should_not_give_correct_value() {
        int a = 5;
        int b = 5;

        int result = calculator.add(a, b);
        Assertions.assertNotEquals(11, result);
    }

    @Test
    void subtract_two_numbers() {
        int a = 5;
        int b = 5;

        int result = calculator.subtract(a, b);
        Assertions.assertEquals(0, result);
    }

    @Test
    void subtracting_lowest_value_with_greatest_value() {
        int a = 2;
        int b = 5;

        int result = calculator.subtract(a, b);
        Assertions.assertEquals(-3, result);
    }

    @Test
    void multiply_two_numbers() {
        int a = 2;
        int b = 5;

        int result = calculator.multiply(a, b);
        Assertions.assertEquals(10, result);
    }

    @Test
    void multiplying_two_negative_numbers() {
        int a = -2;
        int b = -5;

        int result = calculator.multiply(a, b);
        Assertions.assertEquals(10, result);
    }

    @Test
    void multiplying_one_negative_and_one_positive_number() {
        int a = 2;
        int b = -5;

        int result = calculator.multiply(a, b);
        Assertions.assertEquals(-10, result);
    }

    @Test
    void divide_two_numbers_whose_result_is_a_float() {
        int a = 5;
        int b = 2;

        float result = (float) calculator.divide(a, b);
        Assertions.assertEquals(2.5, result);
    }

    @Test
    void divide_two_whole_numbers() {
        int a = 20;
        int b = 2;

        double result = calculator.divide( a,  b);
        Assertions.assertEquals(10, result);
    }

    @Test
    void dividing_a_number_with_zero() {
        int a = 5;
        int b = 0;

        double result = calculator.divide(a, b);
        Assertions.assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    void finding_squareRootOf_a_number() {
        int a = 16;

        double result = (double)calculator.squareRootOf(a);
        Assertions.assertEquals(4, result);
    }

    @Test
    void squareRootOf_a_number() {
        int a = 26;

        double result = (double)calculator.squareRootOf(a);
        Assertions.assertEquals(5.0990195135927845, result);
    }

    @Test
    void GetArea_PositiveRadius() {

        int a = 5;
        double expectedArea = Math.PI * (a * a);
        double result = calculator.getArea(a);
        Assertions.assertEquals(expectedArea, result, 0.01);
    }

    @Test
    void GetArea_zeroRadius() {

        int a = 0;
        double expectedArea = Math.PI * (a * a);
        double result = calculator.getArea(a);
        Assertions.assertEquals(expectedArea, result, 0.01);
    }

    @Test
    void GetArea_negativeRadius() {
        int a = -5;
        double expectedArea = Double.NaN;
        double result = calculator.getArea(a);
        Assertions.assertEquals(expectedArea, result, 0.01);
    }

    @Test
    void GetCircumference_positiveRadius() {
        int a = 8;
        double expectedArea = Math.PI * 2 * a ;
        double result = calculator.getCircumference(a);
        Assertions.assertEquals(expectedArea, result, 0.01);
    }

    @Test
    void GetCircumference_ZeroRadius() {
        int a = 0;
        double expectedArea = Math.PI * 2 * a ;
        double result = calculator.getCircumference(a);
        Assertions.assertEquals(expectedArea, result, 0.01);
    }

    @Test
    void GetCircumference_NegativeRadius() {
        int a = -8;
        double expectedArea = Double.NaN ;
        double result = calculator.getCircumference(a);
        Assertions.assertEquals(expectedArea, result, 0.01);
    }
}
