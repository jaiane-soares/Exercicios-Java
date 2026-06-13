package logica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try{
            System.out.println(" Qual o preço do produto? ");
            double produto = scanner.nextDouble();
            double precoPromocional = produto * 0.95;

            System.out.printf("O PREÇO PROMOCIONAL (com 5%% de desconto) é: R$ %.2f\n", precoPromocional);
        } catch (InputMismatchException e) {
            System.out.println("Error: digite um numero");
        }finally {
            scanner.close();
        }
    }
}

//Crie um programa que leia o preço de um produto, calcule e mostre o seu
//        PREÇO PROMOCIONAL, com 5% de desconto.