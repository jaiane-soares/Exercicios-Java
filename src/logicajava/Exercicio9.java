package logica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio9 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double TAXA_DOLAR = 5.43;

        System.out.println("--- Conversor de Reais (R$) para Dólares (US$) ---");
        System.out.println("Cotação considerada: US$1,00 = R$" + TAXA_DOLAR);

        try {
            System.out.print("Digite o valor em Reais (R$) que você tem na carteira: R$");

            double reais = scanner.nextDouble();
            double dolares = reais / TAXA_DOLAR;

            System.out.printf("\nCom R$%.2f, você pode comprar US$%.2f dólares.\n", reais, dolares);


        }catch (InputMismatchException e){
            System.out.println("Error: digite um numero");
        }
        finally {
            scanner.close();
        }


    }



}
