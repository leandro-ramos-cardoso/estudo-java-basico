// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

package Modulo05;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.printf("O número %d é negativo", numero);
        } else {
            System.out.printf("O número %d é positivo", numero);
        }
    }
}
