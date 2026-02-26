
package br.ulbra.aula1;

public class pessoa1 {
    public String nome;
    public int anoNascimento;
    public double peso;
    
    
    public void calcularIdade(){
        
        int idade = 2026 - anoNascimento;
        
        if(idade>=18){
            System.out.println("A(o) " + nome);
            System.out.println("Tem: " + idade + " anos");
            System.out.println("Essa pessoa é maior de idade! +18");
        }else{
            System.out.println("A(o) " + nome);
            System.out.println(" tem: " + idade);
            System.out.println("Essa pessoa é menor de idade! -18");
        }
    
    }
    
    public void mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Nasceu em: " + anoNascimento);
        System.out.println("Peso: " + peso);
        calcularIdade();
    }
}
