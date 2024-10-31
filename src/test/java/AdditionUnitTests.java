import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionUnitTests {

    @Test
    public void add_int_1_and_int_2_returns_3() {
        int a = 1;
        int b = 2;
        Number expectedAnswer = 3.0;
        Calculator calc = new Calculator();

        calc.push(a);
        calc.push(b);
        calc.push("+");
        Number actualAnswer = calc.value();

        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void add_int_2_and_int_2_returns_4() {
        int a = 2;
        int b = 2;
        Number expectedAnswer = 4.0;
        Calculator calc = new Calculator();
        calc.push(a);
        calc.push(b);
        calc.push("+");
        Number actualAnswer = calc.value();
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void add_operator_results_in_addition(){
        int a = 2;
        int b = 4;
        Number expectedAnswer = 6.0;
        Calculator calc = new Calculator();
        calc.push(a);
        calc.push(b);
        calc.push("+");
        Number actualAnswer = calc.value();
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void unknown_operator_results_in_addition(){
        int a = 2;
        int b = 4;
        Number expectedAnswer = 6.0;
        Calculator calc = new Calculator();
        calc.push(a);
        calc.push(b);
        calc.push("?");
        Number actualAnswer = calc.value();
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void subtract_operator_results_in_subtraction(){
        int a = 6;
        int b = 10;
        Number expectedAnswer = 4.0;
        Calculator calc = new Calculator();
        calc.push(a);
        calc.push(b);
        calc.push("-");
        Number actualAnswer = calc.value();
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void multiply_operator_results_in_multiplication(){
        int a = 6;
        int b = 10;
        Number expectedAnswer = 60.0;
        Calculator calc = new Calculator();
        calc.push(a);
        calc.push(b);
        calc.push("*");
        Number actualAnswer = calc.value();
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void divide_operator_results_in_division(){
        int a = 6;
        int b = 2;
        Number expectedAnswer = 3.0;
        Calculator calc = new Calculator();
        calc.push(a);
        calc.push(b);
        calc.push("/");
        Number actualAnswer = calc.value();
        assertEquals(expectedAnswer, actualAnswer);
    }
}
