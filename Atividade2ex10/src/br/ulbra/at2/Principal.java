/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.at2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Vendedor vend = new Vendedor();
        Scanner ler = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");
        
        System.out.println("Informe o nome do vendedor: ");
        vend.setNome(ler.nextLine()); 
        System.out.println("Informe a meta do vendedor: ");
        vend.setMeta(ler.nextDouble());
        System.out.println("Informe a venda total do vendedor: ");
        vend.setTotalVendido(ler.nextDouble());
        
        System.out.println("A comissão do vendedor é: " + f.format(vend.calcularComissao(vend.getTotalVendido())));
        
        
        
    }
}
