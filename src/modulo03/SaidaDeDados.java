package modulo03;

import java.util.Locale;

public class SaidaDeDados {

    public static void main(String[] args) {
        // Sem quebra de linha ao final
        System.out.print("Bom dia!");

        // Com quebra de linha ao final
        System.out.println("Bom dia!");
        System.out.println("Boa tarde");

        int y = 32;
        System.out.println(y);

        // Escrevendo um valor de ponto flutuante
        double x = 10.35784;
        System.out.println(x);

        // %.2f - Duas casas decimais arredondando (usando virgula como separador)
        // %n - Quebra de linha
        System.out.printf("%.2f%n", x);

        // printf pega o formato do computador que usamos, por isso ele pegou virgula (Meu pc usando a linguagem PT-BR)
        System.out.printf("%.4f%n", x);

        // Se quiser usar o (.) ao inves de (,)
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);

        // Concatenar vários elementos em um mesmo comando
        System.out.println("Resultado: " + x + " metros");

        // Concatenar vários elementos em um mesmo comando usando o printf
        System.out.printf("Resultado: %.2f metros%n", x);

        // Concatenar vários elementos em um mesmo comando usando o printf
        String nome = "Manuela";
        int idade = 3;
        double renda = 10000.00;

        System.out.printf("%s tem %d anos e ganha R$ %.2f%n", nome, idade, renda);
    }
}
