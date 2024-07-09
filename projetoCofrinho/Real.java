package projetoCofrinho;

//Classe Real que estende a classe abstrata Moeda
public class Real extends Moeda {
	
    // Construtor que inicializa o valor da moeda Real
	public Real(double valorInicial) {
		this.valor = valorInicial;
	}
	
    // Método sobrescrito info() que exibe as informações da moeda Real
	@Override
	public void info() {
		System.out.println("Real - " + valor);
	}
	
    // Método sobrescrito converter() que retorna o valor da moeda Real
	@Override
	public double converter() {
		return this.valor;
		
	}
	
    // Método sobrescrito equals() que verifica a igualdade entre dois objetos da classe Real
	@Override
	public boolean equals (Object objeto) {
	    // Verifico se o objeto é da mesma classe
		if (this.getClass() != objeto.getClass()) {
		return false;
		}
		
        // Realizo o cast do objeto para a classe Real
		Real objetoDeReal = (Real) objeto;
		
        // Comparo os valores das moedas
		if (this.valor != objetoDeReal.valor) {
		return false; 
		}
		
		return true;
	} 
}


