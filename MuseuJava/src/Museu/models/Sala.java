package Museu.models;

public class Sala {
	 private String nome;
	    private String descricao;
	    private int anoCriacao;
	    
	    

	    public Sala(String nome, int anoCriacao) {
			super();
			this.nome = nome;
			this.anoCriacao = anoCriacao;
		}

		public void exibirConteudo() {
	        System.out.println("Esta é a " + getNome());
	        System.out.println("Ano de Criação da Sala: " + getAnoCriacao());
	    }

	    //Getter e Setters:
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getDescricao() {
	        return descricao;
	    }

	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }

	    public int getAnoCriacao() {
	        return anoCriacao;
	    }

	    public void setAnoCriacao(int anoCriacao) {
	        this.anoCriacao = anoCriacao;
	    }
}
