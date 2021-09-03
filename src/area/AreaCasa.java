package area;

import java.util.Scanner;

public class AreaCasa {
	public static void main(String[] args) {
		
Scanner leitor = new Scanner (System.in);
		
		String nome, resposta ;
		double largura, comprimento;
		int numeroRepeticao = 0, contador = 0;
	
		
		System.out.print("De qual cômodo você deseja saber a area? ");
		nome = leitor.next();
		
		System.out.print("Qual é a largura em metros do cômodo? ");
		largura = leitor.nextInt();
		System.out.print("Qual é o comprimento em metros do cômodo? ");
		comprimento = leitor.nextInt();
		System.out.println("A " +  nome + " tem " + (largura * comprimento) + " metros quadrados");
		
		System.out.println("Você deseja calcular mais cômodos?");
		resposta = leitor.next();
		
		while () {
			
		}
	
		
		
		
	
		
		
		
		
	}

}
