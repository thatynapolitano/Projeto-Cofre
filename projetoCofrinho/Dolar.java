package projetoCofrinho;

//Classe Dolar que estende a classe abstrata Moeda
public class Dolar extends Moeda {

    // Construtor que inicializa o valor da moeda Dolar
	public Dolar(double valorInicial) {
		this.valor = valorInicial;
	}

    // Método sobrescrito info() que exibe as informações da moeda Dolar
	@Override
	public void info() {
		System.out.println("Dólar - " + valor);
		
	}
	
    // Método sobrescrito converter() que retorna o valor da moeda Dolar
	@Override
	public double converter() {
		return this.valor * 5.2;
	}
	
    // Método sobrescrito equals() que verifica a igualdade entre dois objetos da classe Dolar

	@Override
	public boolean equals (Object objeto) {
		if (this.getClass() != objeto.getClass()) {
		return false;
		}
		
		Dolar objetoDeDolar = (Dolar) objeto;
		
		if (this.valor != objetoDeDolar.valor) {
		return false; 
		}
		
		return true;
	} 
}

