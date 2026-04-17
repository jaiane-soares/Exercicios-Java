package logica;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner sacanner = new Scanner(System.in);


        System.out.println("Escreva um numero inteiro: ");
        int num1 = sacanner.nextInt();

        System.out.println("Escreva outro numero inteiro: ");
        int num2 = sacanner.nextInt();

        if (num1>num2){
            System.out.println("O primeiro valor é maior");
        } else if (num2>num1) {
            System.out.println("O segundo valor é maior");

        }else {
            System.out.println("Não existe valor maior, os dois são iguais");
        }

        sacanner.close();
    }
}

//) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
//na tela uma das mensagens abaixo:
//        - O primeiro valor é o maior
// - O segundo valor é o maior
// - Não existe valor maior, os dois são iguais