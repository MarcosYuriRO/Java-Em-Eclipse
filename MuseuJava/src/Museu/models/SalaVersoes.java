package Museu.models;

public class SalaVersoes extends Sala{
	 public SalaVersoes() {
		super("Sala de Versões do Java", 2022);
	}

	 @Override
	    public void exibirConteudo() {
	        super.exibirConteudo();
	        System.out.println("""
	                Principais Versões JAVA:
	                -Java 1.0;
	                -Java 5;
	                -Java 8 (LTS);
	                -Java 17 (LTS);
	                """);
	    }
	 
	 
}
