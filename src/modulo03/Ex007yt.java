package modulo03;

import java.util.Locale;
import java.util.Scanner;

public class Ex007yt {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float largura, comprimento, valorMetroQuadrado;

        largura = sc.nextFloat();
        comprimento = sc.nextFloat();
        valorMetroQuadrado = sc.nextFloat();

        float areaDoTerreno = largura * comprimento;

        System.out.printf("Area do terreno: %.2f cm2\n", areaDoTerreno);
    }
}
