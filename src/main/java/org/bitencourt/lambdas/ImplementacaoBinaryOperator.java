package org.bitencourt.lambdas;

import java.util.function.BinaryOperator;

public class ImplementacaoBinaryOperator {

    public static void main(String[] args) {

        /*
         * BinaryOperator - represents an operation upon two operands of the same type,
         * producing a result of the same type as the operands.
         * It is a specialization of BiFunction where all three type parameters (input 1, input 2, and result) are the same.
         */

        BinaryOperator<Double> calculo = (x, y) -> { return x + y; };
        System.out.println(calculo.apply(2D,3D));

        calculo = ( x, y) -> x * y;
        System.out.println(calculo.apply(2D,3D));

        // Test with Integer
        BinaryOperator<Integer> calculo2 = (x, y) -> { return x + y; };
        System.out.println(calculo2.apply(2,3));

        calculo2 = ( x, y) -> x * y;
        System.out.println(calculo2.apply(2,3));
    }

}
