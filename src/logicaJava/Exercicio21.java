package logica;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sacanner = new Scanner(System.in);


//        Calendário Gregoriano

        System.out.println("Digite um ano: ");
        int ano = sacanner.nextInt();

        boolean eBissexto = ((ano % 4 == 0 && ano % 100 != 0)|| ano % 400 == 0);

        if (eBissexto){
            System.out.println("O ano é bissexto ");

        }else {
            System.out.println("O ano não é bissexto ");
        }
        sacanner.close();

    }
}
