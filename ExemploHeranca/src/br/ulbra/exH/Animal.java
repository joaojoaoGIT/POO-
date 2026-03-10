
package br.ulbra.exH;

public class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void comer(){
        System.out.println("Animal comendo!");
    }
    public void dormir(){
        System.out.println("Animal dormindo!");
    }
    public void emitirSom(){
        System.out.println("Animal cantando ópera!");
    }

}
