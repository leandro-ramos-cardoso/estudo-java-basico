// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

package Modulo04;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código da peça 1: ");
        int codigo = sc.nextInt();

        System.out.println("Digite a quantidade de peças 1: ");
        int quantidadePecasUm = sc.nextInt();

        System.out.println("Digite o valor unitário: ");
        double valorUnitario = sc.nextDouble();

        System.out.println("Digite o código da peça 2: ");
        int codigoPecaDois = sc.nextInt();

        System.out.println("Digite a quantidade de peças 1: ");
        int quantidadePecasDois = sc.nextInt();

        System.out.println("Digite o valor unitário: ");
        double valorUnitarioPecaDois = sc.nextDouble();

        double valorTotalPecaUm = (valorUnitario * quantidadePecasUm);
        double valorTotalPecaDois = (valorUnitarioPecaDois * quantidadePecasDois);
        double valorTotal = valorTotalPecaUm + valorTotalPecaDois;

        System.out.println(valorTotal);
    }
}
