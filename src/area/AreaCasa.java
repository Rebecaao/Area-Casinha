package area;

import java.util.Scanner;

public class AreaCasa {
	public static void main(String[] args) {
		
Scanner leitor = new Scanner (System.in);
		
		String nome, resposta ;
		double largura, comprimento;
		int numeroRepeticao = 0, contador = 0;
	
		
		System.out.print("De qual c�modo voc� deseja saber a area? ");
		nome = leitor.next();
		
		System.out.print("Qual � a largura em metros do c�modo? ");
		largura = leitor.nextInt();
		System.out.print("Qual � o comprimento em metros do c�modo? ");
		comprimento = leitor.nextInt();
		System.out.println("A " +  nome + " tem " + (largura * comprimento) + " metros quadrados");
		
		System.out.println("Voc� deseja calcular mais c�modos?");
		resposta = leitor.next();
		
		while () {
			
		}
	
		
		
		
	
		
		
		
		
	}

}
