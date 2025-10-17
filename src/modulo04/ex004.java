// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

package modulo04;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número do funcionário: ");
        int numeroFuncionario = scanner.nextInt();

        System.out.println("Informe o número de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.println("Valor por hora trabalhada: ");
        double valorHora = scanner.nextDouble();

        double valorSalario = valorHora * horasTrabalhadas;

        System.out.println(numeroFuncionario);
        System.out.println(valorSalario);
    }
}
