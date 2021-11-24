
package narea;



public class Arvore 
{
  private Noh raiz;   
  private int N;
  
      public void setN(int N) 
    {
        this.N = N;
    }
  
  public int buscaPos(Noh p, int info)
  {
      int pos=0;
      while(pos< p.getTl() && info > p.getInfo(pos))
        pos++;
      return pos;
  }
  
  public void remaneja(Noh p, int pos)
  {
        for (int i=raiz.getTl(); i>pos; i--)   
        {
            p.setInfo(i, p.getInfo(i-1));
            p.setLig(i, p.getLig(i-1));
        }
  }
  
  public void insere(int info)
    {
        Noh p,ant=null;
        int pos=0;
        boolean inseriu=false;
        if (raiz==null) 
        {
            raiz=new Noh(N,info);
            inseriu=true;
        }
        else
        {
            p=raiz;
            while ((p!=null) && (!inseriu))
            {
                if (p.getTl()< raiz.getN())
                {                    
                    pos=buscaPos(p, info);
                    remaneja(p,pos);
                    p.setInfo(pos, info);
                    p.setTl(p.getTl()+1);
                    inseriu=true;
                }
                else
                {
                     ant=p;
                     pos=buscaPos(p, info);
                     p=p.getLig(pos);
                }
            }
            if (!inseriu)
            {
                ant.setLig(pos, new Noh(N,info));
            }
        }
    } 
  
        public void exibe(Noh raiz)
        {
            if (raiz!=null)
            {
                Noh p=raiz;
                int i=0;
                int j=0;
                while (j<N+1)
                {
                    while(i<N)
                    {
                        System.out.println(p.getInfo(i++));  
                    }
                    exibe(p.getLig(j));
                }
            }
        }
}
