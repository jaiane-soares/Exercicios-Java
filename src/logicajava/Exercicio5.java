package logica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio5 {
    public double nota1;
    public  double nota2;

    public String media() {
        double media = (nota1 + nota2) / 2;
        System.out.println(" A sua média é: " + media);
        return null;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exercicio5 ex = new Exercicio5();

        try {
            System.out.println(" Digite sua primeira nota ");
            ex.nota1 = scanner.nextDouble();

            System.out.println("Digite a segunda nota: ");
            ex.nota2 = scanner.nextDouble();

            ex.media();

        }catch(InputMismatchException e){
            System.out.println("error: digite um numero");
        }
        finally {
            scanner.close();
        }
    }
}
