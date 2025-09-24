package Modulo04;

import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, soma;

        a = input.nextInt();
        b = input.nextInt();

        soma = a + b;

        System.out.println("Soma = " + soma);

        input.close();
    }
}
