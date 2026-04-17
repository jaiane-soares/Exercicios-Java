package logica;

import java.util.Scanner;

public class Exercico42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        System.out.println("digite um  numero inteiro:");
        int num = scanner.nextInt();

        while (contador <=num){
            System.out.print(contador + " " );
            contador ++;
        }

        System.out.println("Acabou");
    }
}
