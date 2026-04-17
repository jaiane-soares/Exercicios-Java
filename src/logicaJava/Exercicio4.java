package logica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio4 {
   public int number1;
   public int number2;



    public String soma(){
        int soma = number1 + number2;
        System.out.println(" A soma entre " + number1 + " e " + number2 + " é: " + soma);
        return null;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exercicio4 ex = new Exercicio4();


        try{
            System.out.println("Digite um numero inteiro: ");
            ex.number1 = scanner.nextInt();

            System.out.println(" Digite outro numero inteiro: ");
            ex.number2 = scanner.nextInt();

            ex.soma();


        } catch (InputMismatchException e) {
            System.out.println(" error: digite um numero inteiro");;
        }
        finally {
            scanner.close();
        }
    }
}
