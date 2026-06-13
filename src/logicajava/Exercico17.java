package logica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercico17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        try{

            System.out.println(" Digite a velocidade do carro: km/h");
            double velocidade = scanner.nextDouble();

            double cobrança = 5;

            if (velocidade >= 80){
                double multa = (velocidade - 80);
                double calculoCobrança = cobrança * multa;

                System.out.println("Obaaa! Você foi mutado com " + calculoCobrança+ " R$");
            }

        }catch (InputMismatchException e){

            System.out.println(" Error: digite um numero ");

        }finally {
            scanner.close();
        }

    }
}


//Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
//80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
//o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.