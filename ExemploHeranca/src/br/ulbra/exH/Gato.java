package br.ulbra.exH;

public class Gato extends Animal {

    private boolean peloLongo;

    public Gato(String nome, int idade, boolean peloLongo) {
        super(nome, idade);
        this.peloLongo = this.peloLongo;
    }

    public void emitirSom() {
        System.out.println("Miauuu");
    }

    public void arranharMoveis() {
        System.out.println("Gato DO DEMONIOOOOOOOOOOOO");
    }
}
