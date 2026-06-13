package logica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Qual a largura da sua parde? ");
            double largura = scanner.nextDouble();

            System.out.println("Qual a altura da parede? ");
            double altura = scanner.nextDouble();

            double area = largura * altura;
            double calculoQ= area/2;

            System.out.println("A área a ser pintada é: " + area + " m²" );
            System.out.println("A quantidade de tinha necessária é: " + calculoQ + " litros" );


        }catch (InputMismatchException e){
            System.out.println("Error: digite um numero ");
        }finally {
            scanner.close();
        }

    }
}


//Faça um algoritmo que leia a largura e altura de uma parede, calcule e
//mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
//sabendo que cada litro de tinta pinta uma área de 2metros quadrados.