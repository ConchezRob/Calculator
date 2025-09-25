package calculator;

import java.util.HashSet;
import java.util.Set;

public class Calculator {
    public static int add(int opG, int opD){
        if(opG > 0 && opD > 0 && Integer.MAX_VALUE - opG < opD){
            throw new IllegalArgumentException("Addition hors limite");
        }
        return opG + opD;
    };

    public static int divide(int opG, int opD){
        if(opD == 0){
            throw new IllegalArgumentException("Division par zero impossible");
        }
        return opG / opD;
    } ;

    public Set<Integer> ensembleChiffre(int pNombre) {
        Set<Integer> chiffres = new HashSet<>();
        int n = Math.abs(pNombre);
        if (n == 0) {
            chiffres.add(0);
        }
        while (n > 0) {
            chiffres.add(n % 10);
            n /= 10;
        }
        return chiffres;
    }
}
