package projetoCofrinho;

import java.util.Scanner;

//Classe Menu que gerencia a interação com o usuário através de um menu
public class Menu {
	
	//Scanner para entrada de dados do usuário
	private Scanner sc;
	private Cofrinho cofrinho; 
	
	// Construtor da classe Menu, inicializa o Scanner e construtor do Cofrinho
	public Menu() {
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho(); 
	}
	
	// Método que exibe o menu principal e processa a seleção do usuário
	public void mostrarMenuPrincipal() {
		
		// Exibição das opções do menu
		System.out.println("-------------------");
		System.out.println("      COFRINHO     ");
		System.out.println("-------------------");
		System.out.println("1 - Adicionar Moeda");
		System.out.println("2 - Remover Moeda");
		System.out.println("3 - Listar Moeda");
		System.out.println("4 - Calcular total convertido para Real");
		System.out.println("0 - Encerrar");
		
		String opcaoSelecionada = sc.next();
		
		// Switch para tratar a opção selecionada
		switch (opcaoSelecionada) {
		// Caso "0" para encerrar o programa
		case "0":
			System.out.println("Programa encerrado!");
			break;
	
		// Casos: 1 para adicionar moedas, caso 2 para remover moedas, caso 3 para listar moedas, caso 4 para calcular total convertido para real
		case "1":
			exibirSubMenuAdicionarMoedas();
			mostrarMenuPrincipal();
			break;
			
		case "2":
			exibirSubMenuRemoverMoedas();
			mostrarMenuPrincipal();
			break;
		
		case "3":
			cofrinho.listagemMoedas();
			mostrarMenuPrincipal();
			break; 
			
		case "4":
			double valorTotalConvertido = cofrinho.totalConvertido();
			String valorTotalConvertidoTextual = String.format("%.2f", valorTotalConvertido);
			valorTotalConvertidoTextual= valorTotalConvertidoTextual.replace(".", ","); 
			System.out.println("O valor total convertido para real: " + valorTotalConvertidoTextual);
			mostrarMenuPrincipal();
			break;
			
		// Caso padrão: Opção inválida e chama o menu novamente
		default:
			System.out.println("Opcão Inválida!");
			mostrarMenuPrincipal();
			break; 
		}
	}
	
    // Método para exibir o submenu de adicionar moedas e processar a entrada do usuário ( (Método que chamo no case 1 acima)
	private void exibirSubMenuAdicionarMoedas() {
		System.out.println("Escolha o tipo de moeda a ser adicionada: ");
		System.out.println("1 - Real");
		System.out.println("2 - Dólar");
		System.out.println("3 - Euro");
		
		int escolhaMoeda = sc.nextInt();
		
		System.out.println("Digite o valor da moeda: ");
		
		String valorTextualMoeda = sc.next();
		
		valorTextualMoeda = valorTextualMoeda.replace(",", "."); 
		double valorMoeda = Double.parseDouble(valorTextualMoeda); 
		
		Moeda moeda = null; 
		
		if (escolhaMoeda == 1) {
			moeda = new Real(valorMoeda);
		} else if (escolhaMoeda == 2) {
			moeda = new Dolar(valorMoeda); 
		} else if (escolhaMoeda == 3) {
			moeda = new Euro(valorMoeda);
		} else {				
			System.out.println("Não existe a moeda!"); 
			mostrarMenuPrincipal();
		}
		
		cofrinho.adicionar(moeda);
		System.out.println("Moeda adicionada com sucesso!");
	}
    // Método para exibir o submenu de remover moedas e processar a entrada do usuário (Método que chamo no case 2 acima)
	private void exibirSubMenuRemoverMoedas() {
		System.out.println("Escolha o tipo de moeda a ser removida: ");
		System.out.println("1 - Real");
		System.out.println("2 - Dólar");
		System.out.println("3 - Euro");
		
		// Abaixo recebo o valor do usuário
		int escolhaMoeda = sc.nextInt();
		
		System.out.println("Digite o valor: ");
		
		// Abaixo recebo o valor do usuário
		String valorTextualMoeda = sc.next();
		
		// Substituo , por . 
		valorTextualMoeda = valorTextualMoeda.replace(",", "."); 
		double valorMoeda = Double.parseDouble(valorTextualMoeda); 
		
		Moeda moeda = null; 
		
		if (escolhaMoeda == 1) {
			moeda = new Real(valorMoeda);
		} else if (escolhaMoeda == 2) {
			moeda = new Dolar(valorMoeda); 
		} else if (escolhaMoeda == 3) {
			moeda = new Euro(valorMoeda);
		} else {				
			System.out.println("Não existe a moeda!"); 
			mostrarMenuPrincipal();
		}
		
	// Se removeu a moeda retorna moeda removida com sucesso, senão não foi encontrada moeda com esse valor
		boolean moedaRemovida = cofrinho.remover(moeda);
		
		if(moedaRemovida) {
			System.out.println("Moeda removida com sucesso!");
		} else {
			System.out.println("Não foi encontrada nenhuma moeda com esse valor!");
		}
			
	}
}
