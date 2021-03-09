package collections.comparators.atividade;

import java.time.LocalDate;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private LocalDate nascimento;
    private char sexo;
    private final int rank;

    public Pessoa(String nome, LocalDate nascimento, char sexo){
        this.nome = nome;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.rank = (int)((Math.random() * 1000) + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade(){

        return LocalDate.now().getYear() - nascimento.getYear();
    }

    public int getRank() {
        return rank;
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.getIdade() - o.getIdade();
    }
}
