package logica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try{
            System.out.println(" Digite um numero: ");
            int num = scanner.nextInt();

            float tercPart = num / 3;
            double dobro = num * 2;

            System.out.println(" A terça parte de " + num + " é " + tercPart);
            System.out.println(" O dobro de " + num + " é " + dobro);


        }catch (InputMismatchException e){
            System.out.println("error: digite um numero inteiro");
        }
        finally {
            scanner.close();
        }



    }
}
