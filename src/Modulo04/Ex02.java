// Faça um programa para ler o valor do raio de um círculo, e depois
// mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
//
// Fórmula da área: area = π . raio2
// Considere o valor de π = 3.14159

package Modulo04;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();

        System.out.printf("O valor da área do circulo é igual a %.4f%n", Math.PI * (raio * raio));

        sc.close();
    }
}
