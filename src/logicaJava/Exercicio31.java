package logica;

import java.util.Random;
import java.util.Scanner;



public class Exercicio31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numAleatorio = random.nextInt(3);


        while (true){

            System.out.println("----JOGO JOKENPO----");
            System.out.println("Temos pedra, papel e tesoura"+ "\n" +
                    "pedra = 1" + "\n" +
                    "papel = 2" + "\n" +
                    "tesoura = 3" );
            System.out.println("4 - SAIR DO JOGO ");
            System.out.println("----------------------------");

            System.out.println("Qual você vai escolher? ");
            int escolha = scanner.nextInt();
            int escolhaJogador = escolha - 1;


            if(escolhaJogador == numAleatorio){
                System.out.println("EMPATE: tente novamente");
                continue;

            } else if ((escolhaJogador == 0 && numAleatorio == 2) ||
                    (escolhaJogador == 1 && numAleatorio == 0) ||
                    (escolhaJogador == 2 && numAleatorio == 1) ) {
                System.out.println("PARABÉN, VOCÊ GANHOU");

            }

            if(escolha==4){
                System.out.println("Obrigada por jogar!!");
                scanner.nextInt();
                break;
            }

        }


        scanner.close();
//
//        System.out.println("----JOGO JOKENPO----");
//        System.out.println("Temos pedra, papel e tesoura");
//        System.out.println("Qual você vai escolher? ");
//        String escolha = scanner.next();
//
//        if (escolha.equalsIgnoreCase("Papel")){
//            System.out.println("TESOURA HAHAHA");
//        } else if (escolha.equalsIgnoreCase("Pedra")) {
//
//            System.out.println("PAPEL HAHAHA");
//        }
//        else {
//
//            System.out.println("PEDRA RORO");
//        }
//
//        scanner.close();
//    }


    }

}
