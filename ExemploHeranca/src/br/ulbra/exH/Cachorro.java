package br.ulbra.exH;

public class Cachorro extends Animal {

    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }
    public void emitirSom(){
        System.out.println("Au auu auuuuuuuuuuuuuuuuuuu");
    }
    public void comer(){
        System.out.println("Cachorro comendo!");
    }
    public void mostrarRaca(){
        System.out.println("Raça: " + raca);
    }
}
