package logica;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tabela = "CARROS POPULARES (aluguel de R$90 por dia)\n" +
                "Até 100Km percorridos: R$0,20 por Km\n" +
                "Acima de 100Km percorridos: R$0,10 por Km\n" +
                "CARROS DE LUXO (aluguel de R$150 por dia)\n" +
                "Até 200Km percorridos: R$0,30 por Km\n" +
                "Acima de 200Km percorridos: R$0,25 por Km";

        System.out.println(tabela);
        System.out.println("Qual carro você escolheu(Carro popular/ Carro de luxo?");
        String carrosEscolhido = scanner.nextLine();
        System.out.println("Quantos dias você alugou?");
        int diasAlugados = scanner.nextInt();


        if(carrosEscolhido.equalsIgnoreCase("Carro popular")){
            double aluguel = 90 * diasAlugados;

            System.out.println("Quantos km você percorreu?");
            double km = scanner.nextDouble();
            if (km <=100){
                double taxa = 0.20 * km;
                double totalTaxa = aluguel + taxa;

                System.out.println("Seu saldo para pagamento é de " + totalTaxa);
            } else if (km > 100) {
                double taxa = 0.10 * km;
                double total = aluguel + taxa;
                System.out.println("Seu saldo para pagamento é de " + total);
            }
        }



        if (carrosEscolhido.equalsIgnoreCase("Carro de luxo")){
            double aluguel = 150;
            System.out.println("Quantos km você percorreu?");
            double km = scanner.nextDouble();
            if (km <= 200){
                double taxa = 0.30 * km;
                double totalTaxa = aluguel + taxa;

                System.out.println("Seu saldo para pagamento é de " + totalTaxa);
            } else if (km >200) {
                double taxa = 0.25;
                double total = aluguel + taxa;
                System.out.println("Seu saldo para pagamento é de "+ total);
            }


        }

        scanner.close();

    }
}
//Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
//aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para
//carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa
//que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e
//quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a
//tabela a seguir:
//        - Carros populares (aluguel de R$90 por dia)
// - Até 100Km percorridos: R$0,20 por Km
// - Acima de 100Km percorridos: R$0,10 por Km


// - Carros de luxo (aluguel de R$150 por dia)
// - Até 200Km percorridos: R$0,30 por Km
// - Acima de 200Km percorridos: R$0,25 por Km