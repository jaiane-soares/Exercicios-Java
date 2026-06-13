package logica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{

            System.out.print("Digite o número de dias trabalhados no mês: ");
            int diasTrabalhados = scanner.nextInt();

            int horasPorDia = 8;
            double valorPorHora = 25.0;

            double totalHoras = diasTrabalhados * horasPorDia;
            double salarioTotal = totalHoras * valorPorHora;

            System.out.printf("Total de Horas Trabalhadas: %.0f horas\n", totalHoras);
            System.out.printf("O salário final do funcionário é: R$ %.2f\n", salarioTotal);

        }catch (InputMismatchException e){
            System.out.println("error: digite um numero valido ");
        }finally {
            scanner.close();
        }

    }
}
