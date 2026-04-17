package logica;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor da sua casa? ");
        double valorCasa = scanner.nextDouble();

        System.out.println("Qual o seu salário? ");
        double salarioComprador = scanner.nextDouble();

        System.out.println("Em quantos anos você vai pagar? ");
        int anos = scanner.nextInt();

        int meses = anos * 12;



        double calculoPrestacao = valorCasa / meses;
        double limiteSalario = salarioComprador * 0.30;

        if (calculoPrestacao<=limiteSalario ){
            System.out.printf("Empréstimo APROVADO!%n");
        }else {

            System.out.printf("Empréstimo NEGADO!%n");
        }


        scanner.close();


    }
}

//Escreva um programa para aprovar ou não o empréstimo bancário para a compra
//de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
//em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
//ela não pode exceder 30% do salário ou então o empréstimo será negado.