public class Pessoa {
    char nome;
    char sobrenome;
    int idade;
    double altura;
    double peso;
    double imc;

    public void setAltura(double a){
        this.altura = a;
    }
    public void setPeso(double a){
        this.altura = a;
    }
    public double getAltura(){
        return altura;
    }
    public double getPeso(){
        return peso;
    }

    public double CalculaIMC(){
        double calculo = getPeso() / Math.pow(getAltura(), 2);
        return calculo;
    }
    
    public char informaObesidade(){
        if (calculo < 18.5){
            System.out.println("Abaixo do peso.");
        }
        if (calculo > 18.5 && calculo <24.9){
            System.out.println("Peso normal.");
        }
        if (calculo > 25 && calculo <29.9){
            System.out.println("Sobrepeso.");
        }
        if (calculo > 30 && calculo <34.9){
            System.out.println("Obesidade grau 1");
        }
        if (calculo > 35 && calculo <39.9){
            System.out.println("Obesidade grau 2");
        }
        if (calculo > 40){
            System.out.println("Obesidade grau 3.");
        }
        return 0;
    }
}
