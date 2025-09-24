//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)

package Modulo04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println((a * b) - (c * d));

        sc.close();
    }
}
