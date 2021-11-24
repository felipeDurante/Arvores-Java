
package btree;


public class btree
{
    int n=2;
    No raiz;

    public No navega_ate_folha (No p, int info)
    {

        int i;
        while(p.getLig(0)!=null)
        {
            i=0;
            while(i<p.getTl() && info > p.getInfo(i))
                i++;
            p=p.getLig(i);
        }

        return p;
    }

    public int procura_pos(No tree,int info)
    {
        int i =0;
        while(i<tree.getTl() && info > tree.getInfo(i))
           i++;
        return i;
    }

    public void remaneja (No no, int pos)
    {

        no.setLig(no.getLig(no.getTl()),no.getTl()+1);
        for(int i=no.getTl();i>pos;i--)
        {
            no.setInfo(no.getInfo(i-1),i);
            no.setPos(no.getPos(i-1), i);
            no.setLig(no.getLig(i-1),i);
        }
    }

      public No Localiza_Pai(No raiz,No folha, int info)
    {
        No p,pai;
        int i;
        pai=p=raiz;
        while (p != folha)
        {
            i=0;
            while (i<p.getTl() && info>p.getInfo(i))
              i++;
            pai=p;
            p=p.getLig(i);
        }
        return pai;
    }

      public  void Split (No folha,No pai,int info)
      {
          int i,pos;
          No cx1 = new No();
          No cx2 = new No();
          for(i=0;i<n;i++)
          {
              cx1.setInfo(folha.getInfo(i), i);
              cx1.setPos(folha.getPos(i), i);
              cx1.setLig(folha.getLig(i), i);
          }
          cx1.setLig(folha.getLig(n), n);
          cx1.setTl(n);

          for(i=n+1;i<2*n+1;i++)
          {
             cx2.setInfo(folha.getInfo(i),i-(n+1));
             cx2.setPos(folha.getPos(i), i-(n+1));
             cx2.setLig(folha.getLig(i), i-(n+1));
          }

          cx2.setLig(folha.getLig(n*2+1), n);
          cx2.setTl(n);

          if(pai==folha)
          {
              folha.setInfo(folha.getInfo(n),0);
              folha.setPos(folha.getPos(n), 0);
              folha.setLig(cx1, 0);
              folha.setLig(cx2, 1);
              folha.setTl(1);
          }
          else
          {
              info=folha.getInfo(n);
              pos = procura_pos(pai,info);
              remaneja(pai,pos);
              pai.setTl(pai.getTl()+1);
              pai.setInfo(folha.getInfo(n), pos);
              pai.setPos(folha.getPos(n), pos);
              pai.setLig(cx1, pos);
              pai.setLig(cx2, pos+1);
              if(pai.getTl()>2*n)
              {
                  folha =pai;
                  info = folha.getInfo(n);
                  pai= Localiza_Pai(raiz,folha,info);
                  Split(folha,pai,info);
              }
          }
      }

      public void  Insere(int info,int posarq)
      {
          No folha,pai;
          int pos,i;
          if(raiz == null)
          {
              raiz = new No();
              raiz.setTl(1);
              raiz.setInfo(info, 0);
              raiz.setPos(posarq, 0);
          }
          else
          {
              folha= navega_ate_folha(raiz,info);
              pos=procura_pos(folha,info);
              remaneja(folha,pos);
              folha.setTl(folha.getTl()+1);
              folha.setInfo(info, pos);
              folha.setPos(posarq, pos);
              if(folha.getTl()>2*n)
              {
                  pai=Localiza_Pai(raiz,folha,info);
                  Split(folha,pai,info);
              }

          }

      }

      public void In_Ordem ()
      {
         In_Ordem (this.raiz);
      }

      public void In_Ordem (No raiz)
      {
          int i;
          if(raiz!=null)
          {
              for(i=0;i<raiz.getTl();i++)
              {
                  In_Ordem(raiz.getLig(i));
                  System.out.println(raiz.getInfo(i)+" ");

              }
              In_Ordem(raiz.getLig(i));
          }
      }
}
