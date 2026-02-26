
package br.ulbra.aula1;

public class Principal {
    
    public static void main(String[] args) {
        
        //OBJETO 1
        pessoa1 obj1 = new pessoa1();
        
        obj1.nome = "xiruzão";
        obj1.anoNascimento = 1999;
        obj1.peso = 67;
        
        System.out.println("              ");
        //OBJETO2
        pessoa1 obj2 = new pessoa1();
        
        obj2.nome = "Xiruzinho";
        obj2.anoNascimento = -100243;
        obj2.peso = 67;        
        
        //ANIMAL1
        AnimaL ani1 = new AnimaL();
        
        ani1.nome = "pitoco";
        ani1.idade = 4;
        ani1.raca = "srd";
        
        //ANIMAL2
        AnimaL ani2 = new AnimaL();
        
        ani2.nome = "Leoncia";
        ani2.idade = 19;
        ani2.raca = "Pug";
        
        //PRODUTO1
        Produto prod1 = new Produto();
        
        prod1.nomePro = "Ração";
        prod1.quantidade = 5;
        prod1.valorUni = 15.90;
        
        //PRODUTO2
        Produto prod2 = new Produto();
        
        prod2.nomePro = "Bolacha";
        prod2.quantidade = 10;
        prod2.valorUni = 12.30;
        
        //VENDEDOR1
        Vendedor vend1 = new Vendedor();
        
        vend1.nomeVendedor = "Agdrubar";
        vend1.valorVenda = 32740;
        vend1.comissao = 5;
                
        //VENDEDOR1
        Vendedor vend2 = new Vendedor();
        
        vend2.nomeVendedor = "Amelia";
        vend2.valorVenda = 17900;
        vend2.comissao = 10;
        
        //MOSTRANDO DADOS
        vend1.mostrarDados();
        System.out.println("");
        vend2.mostrarDados();
        
    }
}
