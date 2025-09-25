package calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class CalculatorTest {


    @Test
    void add_devrait_retouner_somme_des_deux_int()
    {
        //GIVEN
        int opG = 5;
        int opD = 3;
        int expected = 8;

        //WHEN
        int result = Calculator.add(opG,opD);

        //THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void divide_devrait_retouner_quotient_des_deux_int()
    {
        //GIVEN
        int opG = 6;
        int opD = 3;
        int expected = 2;

        //WHEN
        int result = Calculator.divide(opG,opD);

        //THEN
        assertThat(result).isEqualTo(expected);
    }
}