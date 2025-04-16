import model.Aluno;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Aluno primeiroAluno = new Aluno("Paulo",47,5.5,9.1,7.3);
        Aluno segundoAluno = new Aluno("Pedro",27,1.5,2.1,2.3);

        primeiroAluno.exibirDados();

        System.out.println("--------------");

        segundoAluno.exibirDados();


    }
}