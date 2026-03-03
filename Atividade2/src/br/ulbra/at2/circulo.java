/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.at2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

    public class circulo {

    private double raio;

    public circulo() {
    }

    public circulo(double raio) {
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void calcularPerimetro() {
        DecimalFormat f = new DecimalFormat("0.00");
        JOptionPane.showMessageDialog(null, "O seu perimetro é de: " + f.format((2 * Math.PI * raio)));
    }

    public void calcularArea() {
        DecimalFormat f = new DecimalFormat("0.00");
        JOptionPane.showMessageDialog(null, "O sua area é de: " + f.format((Math.PI * (raio * raio))));
    }

    public void calcularDiametro() {
        DecimalFormat f = new DecimalFormat("0.00");
        JOptionPane.showMessageDialog(null, "O seu diametro é de: " + f.format((2 * raio)));
    }
    
    public String calcularP(){
        DecimalFormat f = new DecimalFormat("0.00");
        return "O seu perimetro é de: " + f.format((2 * Math.PI * raio));
    }
    public String calcularD(){
        DecimalFormat f = new DecimalFormat("0.00");
        return "O sua area é de: " + f.format((Math.PI * (raio * raio)));
    }
    public String calcularA(){
        DecimalFormat f = new DecimalFormat("0.00");
        return "O seu diametro é de: " + f.format((2 * raio));
    }
}
