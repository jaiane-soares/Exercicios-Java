package logica;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("--- Classificador de Triângulos ---");
            System.out.print("Digite o comprimento do lado A: ");
            double a = scanner.nextDouble();

            System.out.print("Digite o comprimento do lado B: ");
            double b = scanner.nextDouble();

            System.out.print("Digite o comprimento do lado C: ");
            double c = scanner.nextDouble();

            if (a < b + c && b < a + c && c < a + b) {
                System.out.print("Os segmentos formam um triângulo: ");

                if (a == b && b == c) {
                    System.out.println("EQUILÁTERO");
                } else if (a != b && b != c && a != c) {
                    System.out.println("ESCALENO");
                } else {
                    System.out.println("ISÓSCELES");
                }
            } else {
                System.out.println("Os segmentos NÃO formam um triângulo.");
            }

            scanner.close();
        }
    }




