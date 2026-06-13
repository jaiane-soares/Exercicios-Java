package logica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Digite a primeira nota: ");
            double notaA= scanner.nextDouble();
            System.out.println("Digite a segunda nota: ");
            double notaB = scanner.nextDouble();

            double media = (notaA + notaB) / 2;
            if (media >=8 ){

                System.out.println(" sua média é de " + media + " (você teve um bom aproveitamento)");
            }else {

                System.out.println(" Não teve um bom aproveitamento, " + "a média está tão feia que não colocarei aqui");
            }



        }catch (InputMismatchException e){

            System.out.println("Error: digite uma nota valida");
        }finally {
            scanner.close();
        }


    }
}


//Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
//média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
//não um bom aproveitamento (se ficou acima da média 7.0).
