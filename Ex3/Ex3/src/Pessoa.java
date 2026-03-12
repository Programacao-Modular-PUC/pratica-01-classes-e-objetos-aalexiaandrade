public class Pessoa {
    Data d = new Data;

    private String nome;
    private String sobrenome;
    private Data data_nascimento;
    private double altura;
    private double peso;
    private double imc;

    public Pessoa(String nome, String sobrenome, int idade, double altura, double peso){
        this.nome = nome;
        this.sobrenome = sobrenome;
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
    public void setPeso(double a){
        this.peso = a;
    }
    public double getAltura(){
        return altura;
    }
    public double getPeso(){
        return peso;
    }
    public int getDataNascimento(){ return data_nascimento;}

    public double CalculaIMC(){
        double calculoIMC = getPeso() / (Math.pow(getAltura(), 2));
        return calculoIMC;
    }

    public String informaObesidade(double imc){
        if (imc <= 18.5){
            return "Abaixo do peso.";
        }
        if (imc >= 18.5 && imc <= 24.9){
            return "Peso normal.";
        }
        if (imc >= 25 && imc <= 29.9){
            return "Sobrepeso.";
        }
        if (imc >= 30 && imc <= 34.9){
            return "Obesidade grau 1";
        }
        if (imc >= 35 && imc <= 39.9){
            return "Obesidade grau 2";
        }
        else{
            return "Obesidade grau 3.";
        }
    }

    public int informaIdade (getDataNascimento){

    }


}
