import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
		int idade;

		System.out.println("Por favor, digite sua idade (apenas números): ");
		Scanner idadeInserida = new Scanner(System.in);

		idade = idadeInserida.nextInt();

		if (idade >= 18) {
			System.out.println("Cliente têm "+idade+" Anos de idade ----- "+"Bem vind@, pode entrar na festa!!!");
		}
		else {
			System.out.println("Cliente têm "+idade+" Anos de idade ----- "+"ENTRADA PROIBIDA - Desculpe, só aceitamos clientes maiores de idade!");

		}
  } 
}