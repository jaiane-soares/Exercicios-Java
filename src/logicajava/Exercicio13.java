package logica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try{
            System.out.print("Digite o salário atual do funcionário (R$): ");
            double salarioAtual = scanner.nextDouble();

            double novoSalario = salarioAtual * 1.15;

            System.out.printf("O novo salário com 15%% de aumento é: R$ %.2f\n", novoSalario);


        }catch (InputMismatchException e){
            System.out.println("Error: digite um numero");

        }finally {
            scanner.close();
        }
    }
}
