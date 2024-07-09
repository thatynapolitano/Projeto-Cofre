package projetoCofrinho;
//Classe Euro que estende a classe abstrata Moeda
public class Euro extends Moeda {

    // Construtor que inicializa o valor da moeda Euro
	public Euro(double valorInicial) {
		this.valor = valorInicial;
	}

    // Método sobrescrito info() que exibe as informações da moeda Euro
	@Override
	public void info() {
		System.out.println("Euro - " + valor);
		
	}
	
    // Método sobrescrito converter() que retorna o valor da moeda Euro
	@Override
	public double converter() {
		return this.valor * 5.9;
	}

    // Método sobrescrito equals() que verifica a igualdade entre dois objetos da classe Euro
	@Override
	public boolean equals (Object objeto) {
		if (this.getClass() != objeto.getClass()) {
		return false;
		}
		
		Euro objetoDeEuro = (Euro) objeto;
		
		if (this.valor != objetoDeEuro.valor) {
		return false; 
		}
		
		return true;
	} 
}
