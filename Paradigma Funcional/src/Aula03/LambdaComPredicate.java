package Aula03;

import java.util.function.Predicate;

public class Lambda<T> {
    public static void main(String[] args) {

        //Utilizando a forma antifa sem lambda usando classe anonima
        CarroPredicate carroPredicate = new CarroPredicate() {
            @Override
            public boolean test(Carro carro) {
                return carro.getCor().equals("verde");
            }
        };

        System.out.println(carroPredicate.test(new Carro("verde")));

        //utilizando lambda
        CarroPredicate carroPredicate2 = (Carro carro) -> carro.getCor().equals("verde");

        System.out.println(carroPredicate2.test(new Carro("amarelo")));

        //utilizando o predicate
        Predicate<Carro> carroPredicate3 = (Carro carro) -> carro.getCor().equals("verde");

        System.out.println(carroPredicate3.test(new Carro("verde")));
    }

}
