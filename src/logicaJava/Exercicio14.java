package logica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.print("Digite a quantidade de Km percorridos: ");
            double kmPercorridos = scanner.nextDouble();

            System.out.print("Digite a quantidade de dias alugados: ");
            int diasAlugados = scanner.nextInt();

            double custoPorDias = diasAlugados * 90.00;
            double custoPorKm = kmPercorridos * 0.20;

            double precoTotal = custoPorDias + custoPorKm;

            System.out.printf("Custo por Dias (R$ 90/dia): R$ %.2f\n", custoPorDias);
            System.out.printf("Custo por Km (R$ 0,20/Km): R$ %.2f\n", custoPorKm);
            System.out.printf("O preço total a pagar é: R$ %.2f\n", precoTotal);



        }catch (InputMismatchException e){

            System.out.println("Error: digite um numero valido");
        }finally {
            scanner.close();
        }
    }



}
