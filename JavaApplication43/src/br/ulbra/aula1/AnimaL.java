/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.aula1;

public class AnimaL {
    
    public String nome;
    public String raca;
    public int idade;
    
    public void verificarRaca(){
        if(raca == "SRD"  || raca == "srd"){
            System.out.println("A raça do animal é: Vira-Lata");
        }else{
            System.out.println("A raça do animal é: " + raca);
        }
    }
    
    public void mostrarDados(){
        System.out.println("O nome do animal é: " + nome);
        System.out.println("A idade do animal é: " + idade + " anos");
        verificarRaca();
    }
}

