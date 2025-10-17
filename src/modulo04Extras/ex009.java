// 9. Crie um programa que converta uma temperatura de Celsius para Fahrenheit.
//    - Fórmula: `F = (C * 9/5) + 32`
package modulo04Extras;

import java.util.Scanner;

public class ex009 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperaturaCelsius = scanner.nextDouble();

        double temperaturaFahrenheit = (temperaturaCelsius * (9/5)) + 32;

        System.out.println(temperaturaFahrenheit);
    }
}
