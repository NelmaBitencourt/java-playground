package org.bitencourt.lambdas;

public class ImplementacaoTradicional {

    public static void main(String[] args) {
        Calculo calculo = new Soma();
        System.out.println(calculo.executar(2,3));

        calculo = new Multiplica();
        System.out.println(calculo.executar(2,3));
    }
}
