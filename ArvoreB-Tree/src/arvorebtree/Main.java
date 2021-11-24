package arvorebtree;

public class Main
{
    public static void main(String[] args) 
    {
        tree arvore = new tree();
        arvore.inseretree(1,0);
        arvore.inseretree(2,1);
        arvore.inseretree(3,2);
        arvore.inseretree(3,2);
        arvore.inseretree(4,3);
        arvore.inseretree(5,4);
        arvore.inseretree(5,4);

        arvore.inseretree(6,5);
        arvore.inseretree(7,6);
        arvore.inordem(arvore.getraiz());
       if( arvore.vaino(41)==null)
           System.out.println("nao achou");
       else
          System.out.println(" achou");
   
    
    }

}
