import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[10]; // Vetor de tamanho 10
        int totalCadastrados = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("--- Cadastro " + (i + 1) + " ---");
            System.out.print("Nome: ");
            String nome = entrada.nextLine();
            System.out.print("Sobrenome: ");
            String sobrenome = entrada.nextLine();

            // Verificação de parada: nome igual ao anterior
            if (i > 0) {
                String nomeAtual = nome + " " + sobrenome;
                String nomeAnterior = pessoas[i-1].getNomeCompleto();
                if (nomeAtual.equalsIgnoreCase(nomeAnterior)) {
                    break;
                }
            }

            System.out.print("Data de Nascimento (dd/mm/aaaa): ");
            String dataStr = entrada.nextLine();
            String[] partesData = dataStr.split("/"); // Dica do roteiro
            Data d = new Data(
                    Integer.parseInt(partesData[0]),
                    Integer.parseInt(partesData[1]),
                    Integer.parseInt(partesData[2])
            );

            System.out.print("Altura (ex: 1,75): ");
            double altura = entrada.nextDouble();
            System.out.print("Peso: ");
            double peso = entrada.nextDouble();
            entrada.nextLine(); // Limpar o buffer

            pessoas[i] = new Pessoa(nome, sobrenome, d, altura, peso);
            totalCadastrados++;
        }

        // Exibição dos dados [cite: 19]
        for (int i = 0; i < totalCadastrados; i++) {
            Pessoa p = pessoas[i];
            System.out.println("\nCadastro " + (i + 1) + ":");
            System.out.println("Nome completo: " + p.getNomeCompleto());
            System.out.println("Nome de referência: " + p.getNomeReferencia());
            System.out.println("Idade: " + p.calculaIdade());
            System.out.println("Peso: " + p.getPeso()); // Adicione getters na classe Pessoa
            System.out.println("Altura: " + p.getAltura());
            System.out.printf("IMC: %.2f\n", p.calculaIMC());
            System.out.println("Classificação: " + p.informaObesidade());
        }
        entrada.close();
    }
}