package logica;

import java.util.Scanner;

public class Exercicio44 {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);



    System.out.println("Digite o numero inicial: ");
    int inicio = scanner.nextInt();

    System.out.println("Digite o numero final: ");
    int numFinal = scanner.nextInt();

    System.out.println("Digite o incremento: ");
    int incremento = scanner.nextInt();

    while (inicio<=numFinal){
        System.out.print(inicio+ " ");
        inicio += incremento;


    }

    System.out.println("Acabou!!");

    scanner.close();


}

}
