package Museu.models;

public class SalaFundadores extends Sala {
	 public SalaFundadores() {
		super("Sala do Fundador do Java", 2020);
	}

	 @Override
	    public void exibirConteudo() {
	        super.exibirConteudo();
	        System.out.println("""
	                O fundador do JAVA foi James Gosling.
	                Ele o criou enquanto trabalhava na empresa Sun Microsystems,
	                uma empresa que, em 1982, foi fundada com o intuito de vender
	                computadores de alto nível, a um baixo preço.
	                Em 2010, a Sun Microsystems foi comprada pela Oracle 
	                (atual empresa dona do JAVA). 
	                """);
	    }
}
