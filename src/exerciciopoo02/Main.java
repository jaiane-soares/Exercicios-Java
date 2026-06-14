package exerciciopoo02;

public class Main {
    public static void main (String[] args){

        Festa festa = new Festa("Festa da Jai", "Aniversário", "05/08/2026", "19h00", "Casa", 30);
        Festa festa02 = new Festa("Festa da Maria", "Aniversário", "05/09/2026", "19h00", "Casa", 30);
        Festa festa03 = new Festa("Festa da Joana", "Casamento", "05/03/2026", "13h00", "Chácara", 100);
        Festa festa04 = new Festa("Festa da Cristiane", "Aniversário", "05/01/2026", "11h00", "Casa", 39);
        Festa festa05 = new Festa("Festa da Julieta", "Despedida de solteiro", "05/08/2026", "23h00", "salão", 40);

        System.out.println(festa);
        System.out.println("--------------------------------");

        System.out.println(festa02);
        System.out.println("--------------------------------");

        System.out.println(festa03);
        System.out.println("--------------------------------");

        System.out.println(festa04);
        System.out.println("--------------------------------");

        System.out.println(festa05);
        System.out.println("--------------------------------");

    }
}
