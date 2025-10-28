package Museu.models;

public class SalaCuriosidades extends Sala {
	 public SalaCuriosidades() {
		super("Sala de Curiosidades sobre o Java", 2025);
	}

	 @Override
	    public void exibirConteudo() {
	        super.exibirConteudo();
	        System.out.println("""
	        Curiosidade 1, Nome:
	        O Java possui este nome devido, durante uma discussão da Sun
	        sobre a necessidade de uma mudança de nome da linguagem, foi
	        indagado á equipe "O que os motiva?"
	        A resposta de alguns foi "Java coffee", uma forma de se referir
	        a um  "Café forte".

	                Curiosidade 2, Minecraft:
	        Você sabia que Minecraft, o jogo mais vendido do mundo,
	                teve a sua primeira versão em Java? Versão esta que ainda
	        é a versão base para atualizaões deste jogo de blococs.

	        Curiosidade 3, Marte:
	        Em 2004, cientistas da NASA, através do sistema Maestro, feito em Java,
	        conseguiram controlar o rover Spirit, o qual foi a primeira tecnologia
	        humana a andar sobre o planeta vermelho.""");
	    }

}
