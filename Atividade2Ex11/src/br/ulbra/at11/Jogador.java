
package br.ulbra.at11;

public class Jogador {
    private String nome;
    private String posicao;
    private int anoNascimento;
    private String nacionalidade;
    private double altura;
    private double peso;
    private int idade;
    public int aposentadoria;
    
    //////////////////////////////////////////
    //CONSTRUTORES
    public Jogador() {
    }
    public Jogador(String nome, String posicao, int anoNascimento, String nacionalidade, double altura, double peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.anoNascimento = anoNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
    }
    //SET E GET
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public String getPosicao() {
        return posicao;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public double getAltura() {
        return altura;
    }
    public double getPeso() {
        return peso;
    }
    public int idade(){
        return idade;
    }
    //////////////////////////////////////////
    
    //Código
    
    public void calcularIdade(){
         idade = 2026-anoNascimento;
    }
    public void calcularAposentadoria(){
        
        if(posicao.equals("Defesa")){    
            aposentadoria = 40;
        }else if(posicao.equals("Meio-campo")){
            aposentadoria = 38;
        }else if(posicao.equals("Ataque")){
            aposentadoria = 35;
        }else
            System.out.println("Aposentado");
        
        int tempoFalta = aposentadoria - idade;
        
        if(tempoFalta > 0){
            System.out.println("Faltam " + tempoFalta + " anos até aposentadoria");
        }else{
            System.out.println("O jogador está aposentado");
        }
  }
    public void mostrarDados(){
        calcularIdade();
    
    System.out.println("Nome: " + nome);
    System.out.println("Posição: " + posicao);
    System.out.println("Ano de Nascimento: " + anoNascimento);
    System.out.println("Nacionalidade: " + nacionalidade);
    System.out.println("Altura: " + altura);
    System.out.println("Peso: " + peso);
    System.out.println("Idade: " + idade);
    
    calcularAposentadoria();
}
    }














    
    
    
    
    
    
    
    
    


    


