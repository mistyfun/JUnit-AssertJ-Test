package org.example.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    // add, subtract, multiply, divide. there should be one method
    // operation(String operation, int numberA, int numberB)
    // for example operation("+", 5, 9)

    @Test
    public void one_plus_one_is_two() {
        Calculator calculator = new Calculator();
        assertThat(calculator.operator("+", 1, 1)).isEqualTo(2);
    }

    @Test
    public void one_subtract_one_is_zero() {
        Calculator calculator = new Calculator();
        assertThat(calculator.operator("-", 1, 1)).isEqualTo(0);
    }

    @Test
    public void two_multiply_two_is_four() {
        Calculator calculator = new Calculator();
        assertThat(calculator.operator("*", 2, 2)).isEqualTo(4);
    }

    @Test
    public void two_divide_two_is_one() {
        Calculator calculator = new Calculator();
        assertThat(calculator.operator("/", 2, 2)).isEqualTo(1);
    }

    @Test
    public void five_divide_two_is_twoPointFive() {
        Calculator calculator = new Calculator();
        assertThat(calculator.operator("/", 5, 2)).isEqualTo(2.5f);
    }

    @Test
    public void one_point_five_add_two_point_five() {
        Calculator calculator = new Calculator();
        assertThat(calculator.operator("+", 1.5f, 2.5f)).isEqualTo(4.0f);
    }

    @Test
    public void five_divided_by_zero() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.operator("/", 5, 0);
        });
        assertThat(exception.getMessage()).isEqualTo("Cannot divded by zero");
    }

}
