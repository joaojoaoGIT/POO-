package br.ulbra.aula2;

public class Veiculos {

    private String modelo;
    private String marca;
    private int ano;

    public Veiculos() {
    }

    //SETERS///
    public Veiculos(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    //SETERS///
    
    //GETERS////
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
    //GETERS////
    
    public void mostrarDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }

}
