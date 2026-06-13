package logica;

import java.util.Scanner;

public class Exercico22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        int idadeSuficiente = 18 - idade;

        if(idade >=18){
            System.out.println(" Aprovado para alistamento ");

        }else {
            System.out.println(" Negado, volte daqui " + idadeSuficiente);

        }
    }
}


//Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
//situação em relação ao alistamento militar.
//        - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
//alistamento.
// - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
//alistamento.