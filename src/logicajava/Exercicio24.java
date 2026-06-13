package logica;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a destancia em km que deseja percorrer: "+ "\n" + "km ");
        double distancia = scanner.nextDouble();

        if(distancia <= 200 ){
            double calculoDistancia = distancia * 0.50;
            System.out.println("Você terá que pagar " + calculoDistancia + " R$");

        }else {
            double calculoDistancia2 = distancia * 0.70;
            System.out.println("Você terá que pagar " + calculoDistancia2 + " R$");
        }

        scanner.close();
    }
}
