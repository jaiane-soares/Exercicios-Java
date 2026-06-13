package logica;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double reajuste = 0;

        System.out.println("Digite seu salario: R$");
        double salario = scanner.nextDouble();

        System.out.println("Qual seu genero(Feminino/ Masculino)?");
        String genero = scanner.next();

        System.out.println("Quantos anos você trabalha na empresa? ");
        int anosEmpresa = scanner.nextInt();

        if (genero.equalsIgnoreCase("Feminino")) {
            if (anosEmpresa <= 15) {
                reajuste = salario * 0.05;

            } else if (anosEmpresa <= 20) {
                reajuste = salario * 0.12;
            } else {

                reajuste = salario * 0.23;
            }

        }

        if (genero.equalsIgnoreCase("Masculino")) {
            if (anosEmpresa <= 20) {
                reajuste = salario * 0.03;

            } else if (anosEmpresa <= 30) {
                reajuste = salario * 0.13;
            } else {


                reajuste = salario * 0.25;
            }

        }

        System.out.println("O salario ficou " + (reajuste + salario) + " com o reajuste");
        scanner.close();
    }
}
//37) Uma empresa precisa reajustar o salário dos seus funcionários, dando um
//aumento de acordo com alguns fatores. Faça um programa que leia o salário atual,
//o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa.
//No final, mostre o seu novo salário, baseado na tabela a seguir:
//        - Mulheres
// - menos de 15 anos de empresa: +5%
//        - de 15 até 20 anos de empresa: +12%
//        - mais de 20 anos de empresa: +23%
//        - Homens
// - menos de 20 anos de empresa: +3%
//        - de 20 até 30 anos de empresa: +13%
//        - mais de 30 anos de empresa:
