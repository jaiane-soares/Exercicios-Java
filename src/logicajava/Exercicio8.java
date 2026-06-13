package logica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Conversor de Medidas ---");
        System.out.print("Digite uma distância em metros (m): ");

        try {
            double metros = scanner.nextDouble();

            double km = metros / 1000.0;
            double hm = metros / 100.0;
            double dam = metros / 10.0;

            double dm = metros * 10.0;
            double cm = metros * 100.0;
            double mm = metros * 1000.0;

            System.out.println("\n--- Resultados da Conversão ---");
            System.out.println("A distância de " + metros + "m corresponde a:");

            System.out.println(km + " Km");
            System.out.println(hm + " Hm");
            System.out.println(dam + " Dam");
            System.out.println(dm + " dm");
            System.out.println(cm + " cm");
            System.out.println(mm + " mm");

        } catch (InputMismatchException e) {
            System.err.println("Error:  digite um número.");
        } finally {
            scanner.close();
        }
    }

}
