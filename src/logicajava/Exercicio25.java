package logica;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("digite o primeiro seg de reta");
        double seg1 = scanner.nextDouble();

        System.out.println("digite o segundo seg de reta");
        double seg2 = scanner.nextDouble();

        System.out.println("digite o terceiro seg de reta");
        double seg3 = scanner.nextDouble();

        boolean condicao = seg1 < (seg2 + seg3) && seg2 < (seg1 + seg3) && seg3 < (seg1 + seg2);

        if (condicao){
            System.out.println("Os segmentos de reta PODEM formar um triângulo.");

        }else {
            System.out.println("Os segmentos de reta não podem formar um triângulo");

        }

        scanner.close();
    }
}
