// 8. Faça um programa que calcule o resto da divisão de um número por 2 e imprima o resultado.
package modulo04Extras;

import java.util.Scanner;

public class ex008 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroEscolhido = scanner.nextInt();

        double restoDivisao = numeroEscolhido % 2;

        System.out.println(restoDivisao);
    }
}
