
package nlista;

public class Noh 
{
    private listaL Lig;
    private listaI Info;
    private int tl, n;
        
    public Noh(int n, int info)
    {
        this.n = n;        
        this.Info = new listaI(info, this.n);
        this.Lig = new listaL(this.n);        
        this.tl = 1;
    }
    
    public Noh getLig(int pos) 
    {        
        NoL aux= Lig.posiciona(pos);
        return aux.getInfo();
    }
    
    public int getInfo(int pos) 
    {
        NoI aux= Info.posiciona(pos);
        return aux.getInfo();
    }
    
    public void setLig(int pos, Noh lig)
    {
        NoL aux=Lig.posiciona(pos);
        aux.setInfo(lig);
    }
    
    public void setInfo(int info, int pos)
    {
        NoI aux=Info.posiciona(pos);
        aux.setInfo(info);
    }

    public int getN() 
    {
        return n;
    }

    public int getTl() 
    {
        return tl;
    }

    public void setTl(int tl) 
    {
        this.tl = tl;
    }    
}
