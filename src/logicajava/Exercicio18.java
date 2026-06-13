package logica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        try{
            System.out.println("Digite o ano de nascimento: ");
            int anoNascimento = scanner.nextInt();

            int calculo = 2025 - anoNascimento;
            if(calculo >=18){
                System.out.println("Parabens, já pode votar");

            }else {
                int incremento = 18 - calculo;
                System.out.println("Ups, não pode votar, volte daqui" + incremento + " anos");
            }


        }catch (InputMismatchException e){
            System.out.println("Error: digite o ano de nascimento ");
        }finally {
            scanner.close();
        }
    }
}
