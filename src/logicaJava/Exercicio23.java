package logica;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite seu nome: ");
        String name = scanner.next();

        System.out.println("Digite seu sexo (F) ou (M): ");
        String sexo = scanner.next();

        System.out.println(" Digite o valor das compras: ");
        double valor = scanner.nextDouble();

        if (sexo.equalsIgnoreCase("F")){
            double percentualDesconto = 15.0;
            double desconto = valor * (percentualDesconto / 100.0);
            double precoComDesconto = valor- desconto;

            System.out.println(name + ", mulheres ganham 15% de desconto, seu desconto foi de: " + desconto + "\n"+
            " e o preço final:  " + precoComDesconto);

        }else{
            double percentualDesconto = 7.0;
            double desconto = valor * (percentualDesconto / 100.0);
            double precoComDesconto = valor- desconto;

            System.out.println(name + ", homens ganham 7% de desconto, seu desconto foi de: " + desconto + "\n"+
                    " e o preço final:  " + precoComDesconto);

        }

        scanner.close();


    }
}
