//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

package Modulo04;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int numeroFuncionario = sc.nextInt();
        int numeroHorasTrabalhadas = sc.nextInt();
        double valorHora = sc.nextDouble();

        System.out.printf("Numero = %d\n", numeroFuncionario);
        System.out.printf("Salario = U$ %.2f\n", numeroHorasTrabalhadas * valorHora);
    }
}
