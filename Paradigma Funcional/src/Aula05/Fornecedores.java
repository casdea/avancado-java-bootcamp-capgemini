package Aula05;

import java.util.function.Supplier;

public class Suppliers {
    public static void main(String[] args) {
        Supplier<Pessoa> pessoaSuppliers = () -> new Pessoa("JOAO",25);
        System.out.println(pessoaSuppliers.get().getNome());

    }
}
