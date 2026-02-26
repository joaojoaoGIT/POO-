/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.aula1;

public class Vendedor {
    
    public String nomeVendedor;
    public double valorVenda;
    public double comissao;
    
    public Vendedor(){
        System.out.println("Vendedor criado");
    }
    
    public void calcularComissao(){
        double total = valorVenda * (comissao/100);
        System.out.println("A comissão do vendedor é de: " + total + " Reais");
    }
    
    public void mostrarDados(){
        System.out.println("O nome do vendedor é: " + nomeVendedor);
        System.out.println("O valor da venda foi de: " + valorVenda + " Reais");
        System.out.println("A comissão do vendedor é de: " + comissao + "%");
        calcularComissao();
        
    }
}
