import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        TrianguloRetangulo tr = new TrianguloRetangulo();

        System.out.println("Digite o cateto 1 e o cateto 2: ");
        double c1 = entrada.nextDouble();
        tr.setC1(c1);
        double c2 = entrada.nextDouble();
        tr.setC2(c2);

        double resultadoH = tr.calculaHipotenusa();
        double resultadoA = tr.calculaArea();
        System.out.println("O resultado da hipotenusa e: "+ resultadoH);
        System.out.println("O resultado da area e: "+ resultadoA);
    }
}