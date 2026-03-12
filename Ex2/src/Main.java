import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.println("Digite o seu idade: ");
        int idade = entrada.nextInt();

        System.out.println("Digite o seu altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Digite o seu peso: ");
        double peso = entrada.nextDouble();

        Pessoa p = new Pessoa(nome, sobrenome, idade, altura, peso); //Constructor
        double imc = p.CalculaIMC();
        System.out.println("O seu IMC e: " + imc + "\nDito isso, sua situacao e de: " + p.informaObesidade(imc));




    }
}