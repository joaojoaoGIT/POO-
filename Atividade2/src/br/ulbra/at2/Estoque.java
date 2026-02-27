
package br.ulbra.at2;

public class Estoque {
    String nomeProd;
    int quantidadeProd;
    String marcaProd;

    public Estoque() {
    }

    public Estoque(String nomeProd, int quantidadeProd, String marca) {
        this.nomeProd = nomeProd;
        this.quantidadeProd = quantidadeProd;
        this.marcaProd = marca;
    }
    
    public void mostrarDados(){
        System.out.println("Nome do produto: " + nomeProd);
        System.out.println("Quantidade produto: " + quantidadeProd);
        System.out.println("Marca do produto: " + marcaProd);
        
        
    }
    
    
}
