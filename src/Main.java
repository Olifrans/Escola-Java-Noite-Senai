import model.Aluno;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//       // Main Simples
//        Aluno primeiroAluno = new Aluno("Paulo",47,5.5,9.1,7.3);
//        Aluno segundoAluno = new Aluno("Pedro",27,1.5,2.1,2.3);
//        primeiroAluno.exibirDados();
//        System.out.println("--------------");
//        segundoAluno.exibirDados();

        // Main Interativa com Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Sistema de Cadastro de Alunos =====");
        System.out.print("Quantos alunos deseja cadastrar? ");
        int quantidadeAlunos = scanner.nextInt();
        scanner.nextLine(); // consumir quebra de linha

        for (int i = 1; i <= quantidadeAlunos; i++) {
            System.out.println("\n--- Aluno " + i + " ---");

            System.out.println("Nome: ");
            String nome = scanner.nextLine();

            System.out.println("Idade: ");
            int idade = scanner.nextInt();

            //Separador é por virgula
            System.out.println("Primeira Nota: ");
            double primeiraNota = scanner.nextDouble();

            //Separador é por virgula
            System.out.println("Segunda Nota: ");
            double segundaNota = scanner.nextDouble();

            //Separador é por virgula
            System.out.println("Terceira Nota: ");
            double terceiraNota = scanner.nextDouble();
            scanner.nextLine();

            Aluno aluno = new Aluno(nome, idade, primeiraNota, segundaNota, terceiraNota);
            System.out.println("\n Resultado de aluno");
            aluno.exibirDados();
        }
        scanner.close();
        System.out.println("\n Cadastro finalizado");
    }
}