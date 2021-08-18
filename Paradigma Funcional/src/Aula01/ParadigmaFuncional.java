package Aula01;

import java.util.function.UnaryOperator;

public class ParadigmaFuncional {
    public static void main(String[] args) {
        //declaro o que deve ser feito
        UnaryOperator<Integer> calcularValorVezes3 = valor -> valor*3;

        int valor = 10;
        System.out.println("O Resultado é ::"+calcularValorVezes3.apply(10));
    }
}
