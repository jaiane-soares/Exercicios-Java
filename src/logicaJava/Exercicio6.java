package logica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;

        try{
            System.out.println("Digite um  um numero: ");
            num = scanner.nextInt();

            int sucessor = num + 1;
            int antecessor = num - 1;

            System.out.println("O sucessor de " + num + " é " + sucessor);
            System.out.println("O antecessor de " + num + " é " + antecessor);

        }catch (InputMismatchException e) {
            System.out.println("error: digite um numero");

        }
        finally {
            scanner.close();
        }
    }

}
