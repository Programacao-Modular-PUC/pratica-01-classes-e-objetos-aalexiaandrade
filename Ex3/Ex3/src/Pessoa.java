import java.util.Calendar;

public class Pessoa {
    // Atributos
    private String nome;
    private String sobrenome;
    private Data dataNascimento; // Atributo do tipo Data conforme item 2
    private double altura;
    private double peso;

    // Construtor
    public Pessoa(String nome, String sobrenome, Data dataNascimento, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    // Métodos

    public int calculaIdade() {
        Calendar hoje = Calendar.getInstance();
        int idade = hoje.get(Calendar.YEAR) - dataNascimento.getAno();

        if (hoje.get(Calendar.MONTH) + 1 < dataNascimento.getMes() ||
                (hoje.get(Calendar.MONTH) + 1 == dataNascimento.getMes() && hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.getDia())) {
            idade--;
        }
        return idade;
    }

    public double calculaIMC() {
        return getPeso() / (Math.pow(getAltura(), 2));
    }

    public String informaObesidade() {
        double imc = calculaIMC();
        if (imc < 18.5) return "Abaixo do peso";
        if (imc < 25) return "Peso normal";
        if (imc < 30) return "Sobrepeso";
        if (imc < 35) return "Obesidade grau 1";
        if (imc < 40) return "Obesidade grau 2";
        return "Obesidade grau 3";
    }

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public String getNomeReferencia() {
        return sobrenome.toUpperCase() + ", " + nome;
    }

    //  Getters e Setters
    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return nome; }

    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }
    public String getSobrenome() { return sobrenome; }

    public void setAltura(double altura) { this.altura = altura; }
    public double getAltura() { return altura; }

    public void setPeso(double peso) { this.peso = peso; }
    public double getPeso() { return peso; }

    public void setDataNascimento(Data dataNascimento) { this.dataNascimento = dataNascimento; }
    public Data getDataNascimento() { return dataNascimento; }
}