package projetoCofrinho;

//Classe abstrata Moeda que servirá como base para diferentes tipos de moedas
public abstract class Moeda {
    // Atributo protegido para armazenar o valor da moeda
	protected double valor;
    // Método abstrato info() que deve ser implementado pelas subclasses para exibir informações sobre a moeda
	public abstract void info();
    // Método abstrato converter() que deve ser implementado pelas subclasses para converter o valor da moeda levando em conta o valor de conversão
	public abstract double converter();
	
}
