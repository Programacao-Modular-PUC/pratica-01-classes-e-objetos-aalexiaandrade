public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;

    public Pessoa(String nome, String sobrenome, int idade, double altura, double peso){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public void setNome(String a){
        this.nome = a;
    }
    public void setSobrenome(String a){
        this.sobrenome = a;
    }
    public void setAltura(double a){
        this.altura = a;
    }
    public void setIdade(int a){
        this.idade = a;
    }
    public void setPeso(double a){
        this.peso = a;
    }
    public double getAltura(){
        return altura;
    }
    public double getPeso(){
        return peso;
    }

    public double CalculaIMC(){
        double calculoIMC = getPeso() / Math.pow(getAltura(), 2);
        return calculoIMC;
    }

    double calculo = CalculaIMC();
    public String informaObesidade(){
        if (calculo < 18.5){
            return "Abaixo do peso.";
        }
        if (calculo > 18.5 && calculo <24.9){
            return "Peso normal.";
        }
        if (calculo > 25 && calculo <29.9){
            return "Sobrepeso.";
        }
        if (calculo > 30 && calculo <34.9){
            return "Obesidade grau 1";
        }
        if (calculo > 35 && calculo <39.9){
            return "Obesidade grau 2";
        }
        else{
            return "Obesidade grau 3.";
        }
    }
}
