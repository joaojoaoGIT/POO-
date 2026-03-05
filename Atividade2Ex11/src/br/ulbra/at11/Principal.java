/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.at11;

import java.util.Scanner;

/**
 *
 * @author aluno.saolucas
 */
public class Principal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Jogador jog1 = new Jogador();
        System.out.println("Insira o nome do jogador:");
        jog1.setNome(ler.nextLine());

        System.out.println("Insira a posição do jogador (Defesa / Meio-campo / Ataque):");
        jog1.setPosicao(ler.nextLine());

        System.out.println("Insira o ano de nascimento:");
        jog1.setAnoNascimento(ler.nextInt());

        ler.nextLine();

        System.out.println("Insira a nacionalidade:");
        jog1.setNacionalidade(ler.nextLine());

        System.out.println("Insira a altura (ex: 1.80):");
        jog1.setAltura(ler.nextDouble());

        System.out.println("Insira o peso:");
        jog1.setPeso(ler.nextDouble());
        
        jog1.mostrarDados();
    }

}
