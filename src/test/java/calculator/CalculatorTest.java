package calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.Set;

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

    @ParameterizedTest
    @org.junit.jupiter.params.provider.CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "-2, 2, 0",
            "0, 0, 0",
            "-1, -2, -3"
    })
    void add_devrait_retouner_somme_des_deux_int_parametrized(int opG, int opD, int expected)
    {
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

    @Test
    void ensembleChiffre_devrait_retouner_ensemble_chiffre_nombre_positif() {
        //GIVEN
        int nombre = 12345;
        Set<Integer> expected = Set.of(1, 2, 3, 4, 5);

        //WHEN
        Set<Integer> result = new Calculator().ensembleChiffre(nombre);

        //THEN
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void ensembleChiffre_devrait_retouner_ensemble_chiffre_nombre_negatif() {
        //GIVEN
        int nombre = -12345;
        Set<Integer> expected = Set.of(1, 2, 3, 4, 5);

        //WHEN
        Set<Integer> result = new Calculator().ensembleChiffre(nombre);
        //THEN
        assertThat(result).isEqualTo(expected);
    }

}