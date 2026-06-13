package logica;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura do terreno: ");
        double largura = scanner.nextDouble();

        System.out.println("Digite o comprimento do terreno:");
        double comprimento = scanner.nextDouble();

        double calculoArea = largura * comprimento;

        if (calculoArea < 100){
            System.out.println("TERRENO POPULAR");
        } else if ( calculoArea<500) {
            System.out.println("TERRENO MASTER");
        }else {
            System.out.println("TERRENO VIP");
        }

    }
}
//Faça um programa que leia a largura e o comprimento de um terreno
//retangular, calculando e mostrando a sua área em m². O programa também
//devemostrar a classificação desse terreno, de acordo com a lista abaixo:
//        - Abaixo de 100m² = TERRENO POPULAR
// - Entre 100m² e 500m² = TERRENO MASTER
// - Acima de 500m² = TERRENO VIP