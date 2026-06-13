package logica;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Quantidade de cigarros fumados por dia: ");
        int cigarrosPorDia = scanner.nextInt();

        System.out.print("Quantos anos ele já fumou: ");
        int anosFumados = scanner.nextInt();

        double diasFumadosNaVida = anosFumados * 365.0;
        double totalCigarros = cigarrosPorDia * diasFumadosNaVida;
        double minutosPerdidosTotais = totalCigarros * 10;

        double diasDeVidaPerdidos = minutosPerdidosTotais / 1440.0;

        System.out.printf("Total de dias de vida perdidos: %.2f dias\n", diasDeVidaPerdidos);

        scanner.close();
    }


}
