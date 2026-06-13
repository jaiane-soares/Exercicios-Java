package logica;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true){
            System.out.println("JOGO DO SORTEIO - TENTE DESCOBRIR O NUMERO");
            System.out.println("7-SAIR");
            try {
                System.out.println("Digite o numero de 0 a 5: ");
                int numJogador = scanner.nextInt();

                int num= random.nextInt(5);


                if (numJogador == 4){
                    System.out.println("Obrigado por jogar!");
                    break;
                }

                if (numJogador ==num ){
                    System.out.println("PARABENS, VOCÊ ACERTOU!!");

                } else if (numJogador > 5) {

                    System.out.println("digite um numero menor que 5");
                    continue;

                } else {
                    System.out.println("Infelizmente você errou, o numero é "+ num);
                }




            }catch (InputMismatchException e){
                System.out.println("Digite um numero inteiro");

            }

            System.out.println("deseja continuar? (S/N)");
            String condicão = scanner.next();
            if (condicão.equalsIgnoreCase("N")) {
            break;
            }




        }


        scanner.close();
    }
}
//32) [DESAFIO] Crie um jogo onde o computador vai sortear um número entre 0 e 5 o
//jogador vai tentar descobrir qual foi o valor sorteado.