package logica;

import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador =1;
        int contPar = 0;
        int contImpar =0;


        while (contador<=6){
            System.out.println("digite o " + contador + "° numero");
            int numLido = scanner.nextInt();


            if(numLido % 2 == 0){
                contPar ++;

            }else{
                contImpar ++;


            }
            contador++;


        }
        System.out.println("A quantidade de numeros pares é de : " + contPar + "\n" +
                "A soma de numeros impares é de: " + contImpar);

        scanner.close();

    }
}
