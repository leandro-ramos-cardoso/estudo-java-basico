// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais

package modulo04;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        int raio = scanner.nextInt();

        double area = Math.PI * raio;

        System.out.printf("Área = %.4f", area);
    }
}
