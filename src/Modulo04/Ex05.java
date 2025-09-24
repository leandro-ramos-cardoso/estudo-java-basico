//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

package Modulo04;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int codigoPeca1 = sc.nextInt();
        int numeroDePecas1 = sc.nextInt();
        double valorUnitario1 = sc.nextDouble();
        int codigoPeca2 = sc.nextInt();
        int numeroDePecas2 = sc.nextInt();
        double valorUnitario2 = sc.nextDouble();


        double ValorPagar = (numeroDePecas1 * valorUnitario1) + (numeroDePecas2 * valorUnitario2);

        System.out.printf("Valor a pagar: R$ %.2f\n", ValorPagar);
    }
}
