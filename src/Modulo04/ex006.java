//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//  a) a área do triângulo retângulo que tem A por base e C por altura.
//  b) a área do círculo de raio C. (pi = 3.14159)
//  c) a área do trapézio que tem A e B por bases e C por altura.
//  d) a área do quadrado que tem lado B.
//  e) a área do retângulo que tem lados A e B.

package Modulo04;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double a = input.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double b = input.nextDouble();

        System.out.println("Digite o terceiro valor: ");
        double c = input.nextDouble();

        double areaTriangulo = (a * c) / 2;
        double areaCirculo = Math.PI * c;
        double areaTrapezio = ((a + b) * c) / 2;
        double areaQuadrado =  b * b;
        double areaRetangulo = a * b;

        System.out.println("Area do triangulo: " + areaTriangulo);
        System.out.println("Area do Circulo: " + areaCirculo);
        System.out.println("Area do Quadrado: " + areaQuadrado);
        System.out.println("Area do Retangulo: " + areaRetangulo);
        System.out.println("Area do Trapezio: " + areaTrapezio);
    }
}
