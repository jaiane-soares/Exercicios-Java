package logica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Qual o seu nome? ");
            String name = scanner.next();

            System.out.println("Qual o seu salário, " + name + "?");
            double salario = scanner.nextDouble();

            System.out.println(" O funcionário " + name+ " recebe o sálario de "+ salario);



        } catch (InputMismatchException e ) {
            System.out.println("Error: digite um numero ");

        }
        finally {
            scanner.close();
        }



    }
}
