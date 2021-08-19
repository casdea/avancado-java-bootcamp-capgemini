package Aula04;

public class Recursividade {
    public static void main(String[] args) {
        System.out.println(fatorialA(5));
    }
    public static double fatorialA(double valor) {
        return fatorialComTailCalc(valor,1);
    }

    public static double fatorialComTailCalc(double valor, double numero) {

        System.out.println(valor +" "+numero);
        if (valor == 0) {
            return numero;
        }
        return fatorialComTailCalc(valor-1,numero*valor);
    }
}
