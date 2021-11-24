package arvorebtree;

public class tree
{
    private No raiz;

    public tree()
    {
        raiz=null;
    }

    public No navegar(int info)
    {
        No folha = raiz;
        int i=0;
        while(folha.getLig(0)!=null)
        {
            while(i<folha.getTl() && info>folha.getVetinfo(i))
                i++;
            folha=folha.getLig(i);
        }
        return folha;
    }

    public int procurapos(No folha,int info)
    {
        int i=0;
        while(i<folha.getTl() && info>folha.getVetinfo(i))
            i++;
        return i;
    }

    public void remaneja(No folha,int pos)
    {
        folha.setLig(folha.getTl()+1,folha.getLig(folha.getTl()));
        for(int i=folha.getTl();i>pos;i--)
        {
            folha.setVetinfo(i,folha.getVetinfo(i-1));
            folha.setVetpos(i,folha.getVetpos(i-1));
            folha.setLig(i,folha.getLig(i-1));
        }
    }

    public No localizapai(No folha,int info)
    {
        No p = raiz;
        No pai = p;
        while(p!=folha)
        {
            int i=0;
            while(i<p.getTl() && info>p.getVetinfo(i))
                i++;
            pai=p;
            p=p.getLig(i);
        }
        return pai;
    }

    public void split(No folha,No pai)
    {
        No cx1 = new No();
        No cx2 = new No();
        int info,pos;
        for(int i=0;i<2;i++)
        {
            cx1.setLig(i,folha.getLig(i));
            cx1.setVetinfo(i,folha.getVetinfo(i));
            cx1.setVetpos(i,folha.getVetpos(i));
        }
        cx1.setLig(2,folha.getLig(2));
        cx1.setTl(2);

        for(int i=3;i<5;i++)
        {
            cx2.setLig(i-3,folha.getLig(i));
            cx2.setVetinfo(i-3,folha.getVetinfo(i));
            cx2.setVetpos(i-3,folha.getVetpos(i));
        }
        cx2.setLig(2,folha.getLig(5));
        cx2.setTl(2);

        if(pai==folha)
        {
            folha.setLig(0,cx1);
            folha.setLig(1,cx2);
            folha.setVetinfo(0,folha.getVetinfo(2));
            folha.setVetpos(0,folha.getVetpos(2));
            folha.setTl(1);
        }
        else
        {
            info=folha.getVetinfo(2);
            pos=procurapos(pai, info);
            remaneja(pai, pos);
            pai.setTl(pai.getTl()+1);
            pai.setVetinfo(pos,folha.getVetinfo(2));
            pai.setVetpos(pos,folha.getVetpos(2));
            pai.setLig(pos,cx1);
            pai.setLig(pos+1, cx2);

            if(pai.getTl()>4)
            {
                folha=pai;
                info=folha.getVetinfo(2);
                pai=localizapai(pai,info);
                split(folha, pai);
            }
        }
    }

    public void inseretree(int info,int posarq)
    {
        No folha,pai;
        int pos;
        if(raiz==null)
        {
            raiz = new No();
            raiz.setVetinfo(0,info);
            raiz.setVetpos(0, posarq);
            raiz.setTl(1);
        }
        else
        {
            folha=navegar(info);
            pos=procurapos(folha,info);
            remaneja(folha,pos);
            folha.setTl(folha.getTl()+1);
            folha.setVetinfo(pos, info);
            folha.setVetpos(pos, posarq);
            if(folha.getTl()>4)
            {
                pai=localizapai(folha,info);
                split(folha,pai);
            }
        }
    }

    public void inordem(No folha)
    {
        int i;
        if (folha!=null)
        {
            for(i=0;i<folha.getTl();i++)
            {
                inordem(folha.getLig(i));
                System.out.printf("%d ",folha.getVetinfo(i));
            }
            inordem(folha.getLig(i));
        }
    }

    public No getraiz()
    {
        return raiz;
    }
    public No vaino(int info)
    {
       No no = raiz;
        int i=0;
        while(no!=null)
        {
            while(i<no.getTl() && no.getVetinfo(i)<info)
             i++;
            if(no.getVetinfo(i)==info)
                return no;
            no=no.getLig(i);
        }
        return null;

    }
   
}
