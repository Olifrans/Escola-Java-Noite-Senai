package model;

public class Aluno {
    private String nomeAluno;
    private int idadeAluno;
    private double notaPrimeira, notaSegunda, notaTerceira;


    public Aluno(String nomeAluno, int idadeAluno, double notaPrimeira, double notaSegunda, double notaTerceira) {
        this.nomeAluno = nomeAluno;
        this.idadeAluno = idadeAluno;
        this.notaPrimeira = notaPrimeira;
        this.notaSegunda = notaSegunda;
        this.notaTerceira = notaTerceira;
    }

    public double calcularMedia(){
        return (notaPrimeira + notaSegunda + notaTerceira) / 3;
    }

    public  boolean aprovado(){
        return calcularMedia() >= 7.0;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nomeAluno);
        System.out.println("Idade: " + idadeAluno);
        System.out.println("Média %.2f: " + calcularMedia());
        System.out.println("Aprovado: " + (aprovado() ? "Sim" : "Não"));
    }


}
