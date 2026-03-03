/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.at2;

import java.text.DecimalFormat;

/**
 *
 * @author aluno.saolucas
 */
public class Vendedor {
    
    private String nome;
    private double meta;
    private double totalVendido;
//Construtores
    public Vendedor() {
    }

    public Vendedor(String nome, double meta, double totalVendido) {
        this.nome = nome;
        this.meta = meta;
        this.totalVendido = totalVendido;
    }
//Set e Get
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMeta(double meta) {
        this.meta = meta;
    }

    public void setTotalVendido(double totalVendido) {
        this.totalVendido = totalVendido;
    }

    public String getNome() {
        return nome;
    }

    public double getMeta() {
        return meta;
    }

    public double getTotalVendido() {
        return totalVendido;
    }
    
//Código
    
    public double calcularComissao(double valorVendido){
        
        double porcentagem = (valorVendido/meta) * 100; 
        double comissao;
        if  (porcentagem < 50){
            comissao = valorVendido * 0.01;
        }else if(porcentagem <= 75){
            comissao = valorVendido * 0.025;
        }else if(porcentagem <100){
            comissao = valorVendido * 0.035;
        }else{
            comissao = valorVendido * 0.05;
        }
        
        return comissao;
  

    }
}

    

