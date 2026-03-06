
public class TrianguloRetangulo{
    // Atributos
    private double cateto1 = 0;
    private double cateto2 = 0;
    private double h;
    private double a;

    // Metodos
    public void setC1(double c1){
            this.cateto1 = c1;
    }
    public void setC2(double c2){
        this.cateto2 = c2;
    }

    public double getC1(){
        return cateto1;
    }
    public double getC2(){
        return cateto2;
    }
    public double calculaHipotenusa() {
        h = Math.sqrt(Math.pow(getC1(), 2) + Math.pow(getC2(), 2));
        return h;
    }
    public double calculaArea() {
        // Num triângulo retângulo, os catetos são a base e a altura
        return (getC1() * getC2()) / 2;
    }
}
