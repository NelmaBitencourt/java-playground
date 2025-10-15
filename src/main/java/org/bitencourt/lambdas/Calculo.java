package org.bitencourt.lambdas;

// Anotação opcional que indica a existencia de um unico metodo obstrato
@FunctionalInterface
public interface Calculo {

    // public and abstract are optional
    public abstract double executar(double a, double b);

    // Posso referenciar o executar
    default String metodoDefault() {
        return "sou um método default";
    }

    static String metodoStatic() {
        return  "sou um método static";
    }
}
