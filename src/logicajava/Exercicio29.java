package logica;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite seu nome: ");
        String name = scanner.next();

        System.out.println("Digite seu salário: " + "\n" + "R$");
        double salario = scanner.nextDouble();

        System.out.println("Quantos anos trabalha na empresa: ");
        int anos = scanner.nextInt();



        if (anos<=3){
            double aumentoSalario = salario * 0.03;
            double novoSalario = salario + aumentoSalario;

                    System.out.println(name + ", você teve um aumento de " + aumentoSalario + "\n"+
                    "seu novo salário é de " + novoSalario );
        } else if (anos<10) {
            double aumentoSalario2 = salario * 0.125;

            double novoSalario = salario + aumentoSalario2;
            System.out.println(name + ", você teve um aumento de " + aumentoSalario2 + "\n"+
                    "seu novo salário é de " + novoSalario );
        }
        else {
            double aumentoSalario3 = salario * 0.200;
            double novoSalario = salario + aumentoSalario3;

            System.out.println(name + ", você teve um aumento de " + aumentoSalario3 + "\n"+
                    "seu novo salário é de " + novoSalario );

        }

        scanner.close();
    }
}
//Desenvolva um programa que leia o nome de um funcionário, seu salário,
//quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
//acordo com a tabela a seguir:
//        - Até 3 anos de empresa: aumento de 3%
//        - entre 3 e 10 anos: aumento de 12.5%
//        - 10 anos ou mais: aumento de 20%