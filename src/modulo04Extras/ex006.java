// 6. Desenvolva um programa que calcule a área de um retângulo.
// Declare duas variáveis para a base e a altura e uma terceira para armazenar o resultado.
package modulo04Extras;

import java.util.Scanner;

public class ex006 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int baseRetangulo = input.nextInt();
        int alturaRetangulo = input.nextInt();
        int areaRetangulo = baseRetangulo * alturaRetangulo;

        System.out.println(areaRetangulo);
    }
}
