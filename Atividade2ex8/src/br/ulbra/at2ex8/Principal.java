
package br.ulbra.at2ex8;

public class Principal {
    public static void main(String[] args) {
        
        Estoque prod1 = new Estoque();
        
        prod1.marcaProd = "Nestlé";
        prod1.nomeProd = "Chocolate de sal";
        prod1.quantidadeProd = 12;
        
        Estoque prod2 = new Estoque();
        
        prod2.marcaProd = "Cara";
        prod2.nomeProd = "Salgadinho caro";
        prod2.quantidadeProd = 1;
        
        prod1.mostrarDados();
        prod2.mostrarDados();
        
    }

}
