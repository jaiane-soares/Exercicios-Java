package logica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("digite o valor de A: ");
            double A = scanner.nextDouble();

            System.out.println("digite o valor de B: ");
            double B = scanner.nextDouble();

            System.out.println("digite o valor de C: ");
            double C = scanner.nextDouble();

            double delta = Math.pow(B,2) - (4 * A * C);
//            double delta = (B*B) - (4 * A *C);

            System.out.printf("O valor de delta é %.2f: ", + delta);

        }catch (InputMismatchException e) {
            System.out.println("error: digite um numero");


        } finally {
            scanner.close();
        }
    }

//    Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
//    segundo grau e mostre o valor de Delta.


}
