package projetoCofrinho;

import java.util.ArrayList;

// Classe Cofrinho que gerencia uma coleção de moedas
public class Cofrinho {

    // Lista para armazenar as moedas
    private ArrayList<Moeda> listaMoedas;
    
    // Construtor que inicializa a lista de moedas
    public Cofrinho() {
        this.listaMoedas = new ArrayList<>(); 
    }
    
    // Método para adicionar uma moeda ao cofrinho
    public void adicionar(Moeda moeda) {
        this.listaMoedas.add(moeda);
    }
    
    // Método para remover uma moeda do cofrinho
    public boolean remover(Moeda moeda) {
        return this.listaMoedas.remove(moeda);
    }
    
    // Método para listar todas as moedas no cofrinho
    public void listagemMoedas() {
        // Verifica se o cofrinho está vazio
        if (this.listaMoedas.isEmpty()) {
            System.out.println("Não existe nenhuma moeda no cofrinho!");
            return;
        }
        
        // Itera sobre as moedas e exibe suas informações
        for (Moeda moeda : this.listaMoedas) {
            moeda.info();
        }
    }
    
    // Método para calcular o valor total convertido das moedas no cofrinho
    public double totalConvertido() {
        // Verifica se o cofrinho está vazio
        if (this.listaMoedas.isEmpty()) {
            return 0;
        }
        
        double valorAcumulado = 0;
        
        // Itera sobre as moedas e acumula o valor convertido
        for (Moeda moeda : this.listaMoedas) {
            valorAcumulado = valorAcumulado + moeda.converter();
        }
        
        return valorAcumulado;
    }
}
