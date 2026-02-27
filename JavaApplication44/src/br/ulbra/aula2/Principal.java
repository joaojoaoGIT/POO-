
package br.ulbra.aula2;

public class Principal {
    public static void main(String[] args) {
        
        Veiculos carro1 = new Veiculos();
       
        carro1.setMarca("vm");
        carro1.setModelo("gol");
        carro1.setAno(2012);
         
        carro1.mostrarDados();
        
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Ano: " + carro1.getAno());
        System.out.println("Idade do carro: " + (2026 - carro1.getAno()));
        
        
    }
   
}

