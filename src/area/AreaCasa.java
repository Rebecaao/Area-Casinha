package area;

import java.util.Scanner;

public class AreaCasa {
	public static void main(String[] args) {
		
Scanner leitor = new Scanner (System.in);
		
		String nome;
		String resposta = "S";
		double largura, comprimento;
		int numeroRepeticao = 0, contador = 0;
		
	
		System.out.println("**************************");
		System.out.println(" Calculo área de uma casa ");
		System.out.println("**************************");
		
		System.out.println();
		
		System.out.print("De qual cômodo você deseja saber a area? ");
		nome = leitor.next();
		
		System.out.print("Qual é a largura em metros do(a) " + nome + "? ");
		largura = leitor.nextInt();
		
		System.out.print("Qual é o comprimento em metros do(a) " + nome + "? " );
		comprimento = leitor.nextInt();
		
		System.out.println();
		
		System.out.println("O(A) " +  nome + " TEM " + (largura * comprimento) + " METROS QUADRADOS " );
		
		System.out.println();
		
		System.out.println("Você deseja calcular mais cômodos? (S/N)");
		resposta = leitor.next();
		
		 while (resposta == "S");
		 if (resposta.equals("S")) {
			
			System.out.println();
			System.out.print("De qual cômodo você deseja saber a area? ");
			nome = leitor.next();
			
			System.out.print("Qual é a largura em metros do(a) " + nome + "? ");
			largura = leitor.nextInt();
			
			System.out.print("Qual é o comprimento em metros do cômodo?  " );
			comprimento = leitor.nextInt();
			
			System.out.println();
			
			System.out.println("O(A) " +  nome + " TEM " + (largura * comprimento) + " METROS QUADRADOS " );
			
			System.out.println();
			
			System.out.println("Você deseja calcular mais cômodos? (S/N)");
			resposta = leitor.next();
		
			
		} else {
		  System.out.println("A área total da casa é 38 metros quadrados.");
		  System.out.println("*********************FIM*******************");
		}
		
		
		
		
	
	
		
		
		
	
		
		
		
		
	}

}
