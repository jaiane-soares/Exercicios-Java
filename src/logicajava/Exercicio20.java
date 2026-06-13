package logica;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println("PAR");
        }else {
            System.out.println("IMPAR");
        }

        scanner.close();

    }
}
