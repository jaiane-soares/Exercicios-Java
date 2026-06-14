package exerciciopoo;

public class Telefone {
    private String marca;
    private String modelo;
    private String numero;
    private String ddd;
    private String tipo;

    public Telefone(String marca, String modelo, String numero, String ddd, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.numero = numero;
        this.ddd = ddd;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numero='" + numero + '\'' +
                ", ddd='" + ddd + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNumero() {
        return numero;
    }

    public String getDdd() {
        return ddd;
    }

    public String getTipo() {
        return tipo;
    }
}