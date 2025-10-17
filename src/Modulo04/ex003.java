// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

package Modulo04;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int a = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int b = sc.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int c = sc.nextInt();

        System.out.println("Digite o quarto numero: ");
        int d = sc.nextInt();

        int calculo = (a * b - c * d);

        System.out.println(calculo);
    }
}
