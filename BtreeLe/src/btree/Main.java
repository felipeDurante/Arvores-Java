/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package btree;

/**
 *
 * @author Letícia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        btree a = new btree();
     No b=null;
      a.Insere( 33 , 0);
      a.Insere( 42 , 1);
      a.Insere( 10 , 2);
      a.Insere( 21 , 3);
     a.Insere( 35 , 4);
      a.Insere(23 , 5);
      a.Insere( 50 , 6);
      a.Insere(25 , 7);

     a.In_Ordem();
    }

}
