package org.bitencourt.lambdas;

public class ImplementacaoComLambda {

    public static void main(String[] args) {

        // Jeito mais completo de expressar
        // {} precisam serem usados com return
        Calculo calculo = ( x, y) -> { return x + y; };
        System.out.println(calculo.executar(2,3));

        // Versão reduzida
        // usando quando tem apenas uma setença de código
        calculo = ( x, y) -> x * y;
        System.out.println(calculo.executar(2,3));

        System.out.println(calculo.metodoDefault());
        System.out.println(Calculo.metodoStatic());
    }

}
