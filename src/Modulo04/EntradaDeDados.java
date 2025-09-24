package Modulo04;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        // Operações essenciais de dados
        // Entrada - Leitura
        // Processamento - Quando o programa realiza cálculos
        // Saída - Escrita

        // Permite ao usuário a entrada de dados
        // Sempre no final inserir a função .close

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String x;
        int y;
        double z;
        char c;

        // next() lê até o próximo espaço/tab/enter.
        // Ex.: se você digitar Olá mundo, x recebe "Olá".
        // Se você quer a linha inteira com espaços, use sc.nextLine().
        // O número digitado será armazenado dentro da variável.
        x = sc.next();
        y = sc.nextInt();

        // Pega a localidade do sistema (O separador de decimais do PTbr é a virgula)
        z = sc.nextDouble();

        // Pega apenas o primeiro caractere
        c = sc.next().charAt(0);

        System.out.println("Você digitou: " + x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(c);

        // Encerrando recurso - OBRIGATÓRIO
        sc.close();
    }
}
