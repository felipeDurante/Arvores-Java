
package narea;
import java.util.Scanner;

public class Narea 
{

    public static void main(String[] args) 
    {
        int n;
        Arvore tree = null;
        Arvore arv;
        Scanner input = new Scanner( System.in );
        while(true)
        {
        System.out.println("_________________________________");
        System.out.println("Aprendendo Arvore N-Área na raça!"); 
        System.out.println("---------------------------------");
        System.out.println("[1] Definir novo tamanho de folha"); 
        System.out.println("[2] Exibir a árvore  por completa"); 
        System.out.println("[3] Excluir um elemento da árvore");
        System.out.println("[4] --------------------Finalizar");
        System.out.println("_________________________________");
        int op= input.nextInt();          
       switch (op)
       {             
           case 1:System.out.println("Digite o tamanho das folhas");
           n=input.nextInt();
           tree.setN(n);
           break;             
        
           case 2:System.out.println("Digite um número para inseriri na arvore");
           n=input.nextInt();           
           break;             
        
           case 4:System.out.println("Exit Successful");
                System.exit(0);
                        
           default:System.out.println("Please enter a valid selection.");           
       };  
        }
    }
}
