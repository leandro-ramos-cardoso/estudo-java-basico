package Modulo04;

import java.util.Locale;
import java.util.Scanner;

public class Ex007yt {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura = sc.nextFloat();
        double comprimento = sc.nextFloat();
        double valorMetroQuadrado = sc.nextFloat();

        double areaDoTerreno = largura * comprimento;
        double precoTerreno = areaDoTerreno * valorMetroQuadrado;

        System.out.printf("Area do terreno: %.2f cm2\n", areaDoTerreno);
        System.out.printf("Valor do terreno: %.2f\n", precoTerreno);

        sc.close();
    }
}
