package logica;

public class Exercicio46 {
    public static void main(String[] args) {

        int valorInicial = 6;
        int valorFinal = 100;
        int acumulador = 0;

    while(valorInicial<=valorFinal){

        System.out.print(valorInicial+ " " );

        acumulador += valorInicial;

        valorInicial += 2;

    }
        System.out.println("A soma dos numeros é de: " + acumulador);


    }
}


//Crie um programa que calcule e mostre na tela o resultado da soma entre 6 +
//        8 + 10 + 12 + 14 + ... + 98 + 100.