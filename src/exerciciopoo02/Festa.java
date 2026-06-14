package exerciciopoo02;

public class Festa {
    private String nome;
    private String tipo;
    private String data;
    private String horarioInicio;
    private String local;
    private int capacidadeMaxima;

    public Festa(String nome, String tipo, String data, String horarioInicio, String local, int capacidadeMaxima) {
        this.nome = nome;
        this.tipo = tipo;
        this.data = data;
        this.horarioInicio = horarioInicio;
        this.local = local;
        this.capacidadeMaxima = capacidadeMaxima;
    }


    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getData() {
        return data;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public String getLocal() {
        return local;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    @Override
    public String toString() {
        return "Festa{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", data='" + data + '\'' +
                ", horarioInicio='" + horarioInicio + '\'' +
                ", local='" + local + '\'' +
                ", capacidadeMaxima=" + capacidadeMaxima +
                '}';
    }
}


