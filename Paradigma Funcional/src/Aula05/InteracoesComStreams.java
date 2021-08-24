package Aula05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interacoes {
    public static void main(String[] args) {
        String[] nomes = {"JOAO","PAULO","OLIVEIRA","SANTOS","INSTRUTOR","JAVA"};
        Integer[] numeros= {1,2,3,4,5};
        imprimirNomesFormatadosExemplo1(nomes);
        imprimirNomesFormatadosExemplo2(nomes);
        imprimirNomesFormatadosExemplo3(numeros);
        imprimirNomesFormatadosExemplo4();;
    }

    private static void imprimirNomesFormatadosExemplo1(String[] nomes) {
        String nomesParaImprimirDaStreamComFiltro = Stream.of(nomes)
                .filter(nome->nome.contains("O"))
                .collect(Collectors.joining());
        System.out.println("Nomes do Stream: "+nomesParaImprimirDaStreamComFiltro);

    }

    private static void imprimirNomesFormatadosExemplo2(String[] nomes) {
        Stream.of(nomes)
            .forEach(nome -> System.out.println(nome));
    }

    private static void imprimirNomesFormatadosExemplo3(Integer... numeros) {
        Stream.of(numeros)
                .map(numero -> numero *2)
                .forEach(numero -> System.out.println(numero));

    }

    private static void imprimirNomesFormatadosExemplo4() {
        List<String> cargos = new ArrayList<>();
        cargos.add("GERENTE");
        cargos.add("MOTORISTA");
        cargos.add("PILOTO");
        cargos.add("JOGADOR");

        //Utilizando Stream de outra FOrma
        cargos.stream()
                .filter(nome -> nome.contains("A"))
                .forEach(nome -> System.out.println(nome));

    }


}
