
package br.ulbra.aula1;

public class Produto {
    
    public String nomePro;
    public double valorUni;
    public int quantidade;
    
    
    
    public void calcularTotal(){
        double total = valorUni * quantidade;
        System.out.println("O valor total é: " + total + " Reais");
    }
    public void mostrarDados(){
        System.out.println("O Produto que pegou é: " + nomePro);
        System.out.println("A quantidade de produtos que pegou é: " + quantidade);
        calcularTotal();
    }
}
