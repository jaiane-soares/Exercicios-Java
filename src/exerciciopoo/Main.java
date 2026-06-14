package exerciciopoo;

public class Main {
    public static void main(String[] args) {

        Telefone telefone = new Telefone("Sansung", "Sansung X12", "12898655", "55", "Celular");
        Telefone telefone02 = new Telefone("Iphone", "Iphone 12", "12898655", "55", "Fixo");
        Telefone telefone03 = new Telefone("Xiomi", "Xiomi X12", "12898655", "55", "Residencial");
        Telefone telefone04 = new Telefone("Lg", "Lg X12", "12898655", "55", "Celular");
        Telefone telefone05 = new Telefone("Logus", " Logus X12", "12898655", "55", "Celular");


        System.out.println(telefone);

        System.out.println("-----------------");
        System.out.println(telefone02);

        System.out.println("-------------------");
        System.out.println(telefone03);

        System.out.println("---------------------");
        System.out.println(telefone04);

        System.out.println("-------------------");
        System.out.println(telefone05);


    }
}
