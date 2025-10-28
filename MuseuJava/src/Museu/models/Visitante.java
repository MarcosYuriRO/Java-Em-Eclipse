package Museu.models;

public class Visitante {
	private String nome;
    private int idade;

    public void explorarSala(Sala sala) {
        sala.exibirConteudo();
    }

    //Getters e Setters:

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
