
package br.ulbra.exH;

public class Principal {
    public static void main(String[] args) {
        Cachorro cao = new Cachorro("rex", 10, "labrador");
        Gato gat = new Gato("Tom", 67, true);
        
        //CACHORRO
        cao.emitirSom();
        cao.comer();
        cao.mostrarRaca();
        //GATO
        gat.emitirSom();
        gat.arranharMoveis();
        //ANIMAL
        Animal ani = new Animal("Xirucudo", 2);
        ani.comer();
        ani.emitirSom();
        
    }
}
