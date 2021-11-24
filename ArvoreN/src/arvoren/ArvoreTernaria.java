package arvoren;

public class ArvoreTernaria
{
    private no raiz = null;
    public void insere(int info)
    {
        no p,ant = null;
        boolean inseriu=false;
        if(raiz==null)
            raiz=new no(info);
        else
        {
            p=raiz;
            while(!inseriu && p!=null)
            {
                if(p.getTl()==1) //Sinal q tem espaco no No
                {
                    if(info<p.getInfo1())
                    {
                        p.setInfo2(p.getInfo1()); //Verificando qual das 2 info sao maiores a q ja tem ou a nova
                        p.setInfo1(info);
                    }
                    else
                        p.setInfo2(info);    // Informacao 2 ta fazia por issu insere nela
                    p.setTl(2);
                    inseriu=true;
                }
                else    //Nao tem espaco no No---Os infos estao ocupados
                {
                    ant = p;
                    if(info<p.getInfo1())
                        p=p.getLig1();
                    else
                        if(info<p.getInfo2())   //Esta andando nos no verificando aonde vai ser inserindo o proximo no
                            p=p.getLig2();
                        else
                            p=p.getLig3();
                }
            }
            if(!inseriu)
            {
                if(info<ant.getInfo1())
                    ant.setLig1(new no(info));
                else
                    if(info<ant.getInfo2()) //criando o novo no na ligacao apropriada
                        ant.setLig2(new no(info));
                    else
                        ant.setLig3(new no(info));
            }
        }
    }
}
