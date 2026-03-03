/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.at2ex8;

/**
 *
 * @author aluno.saolucas
 */
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


