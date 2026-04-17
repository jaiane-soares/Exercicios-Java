package logica;

import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int somaTotal= 0;
       int contador = 1;


        while(contador<=7){
            System.out.println(" digite o " + contador + "° numero ");
            int numLido = scanner.nextInt();

            somaTotal += numLido;
            contador ++;

        }

        System.out.println("A soma total é de " + somaTotal);


        scanner.close();
    }

}
