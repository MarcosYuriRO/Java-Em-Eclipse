package Museu.principal;

import java.util.Scanner;

import Museu.models.Sala;
import Museu.models.SalaCuriosidades;
import Museu.models.SalaFundadores;
import Museu.models.SalaVersoes;
import Museu.models.Visitante;

public class Principal {
	 Visitante visitante = new Visitante();
     Scanner scanner = new Scanner(System.in);
     
     int escolha;
     
     public void exibirMuseu() {
    	 
     
     System.out.println("Olá, visitante! Qual o seu nome?");
     visitante.setNome(scanner.nextLine());
     System.out.println("E sua idade?");
     visitante.setIdade(scanner.nextInt());
     
     if(visitante.getIdade() < 18) {
    	 System.out.println("Você é menor de idade, volte aqui com um responsável!");
     } else {

     System.out.println("Bem-Vindo(a), " + visitante.getNome());
     
     while (escolha != 4) {
     System.out.println("""
             Escolha qual sala desejas visitar:
             1. Sala do Fundador;
             2. Sala das Versões;
             3. Sala das Curiosidades;
             4. Sair do Museu.
             """);
     escolha = scanner.nextInt();
     scanner.nextLine();

     switch (escolha){
         case 1:
             Sala sala1 = new SalaFundadores();
             visitante.explorarSala(sala1);
             break;
         
         case 2:
             Sala sala2 = new SalaVersoes();
             visitante.explorarSala(sala2);
             break;
         
         case 3:
             Sala sala3 = new SalaCuriosidades();
             visitante.explorarSala(sala3);
             break;
         case 4: 
        	 System.out.println("Fique bem!");
             break;
         default:
        	 System.out.println("Opção Inválida.");
     	}
     
     scanner.nextLine();
     	}
     }
   }

}
