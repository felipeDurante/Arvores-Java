
package narea;

public class Noh 
{
    private Noh vetLig[];
    private int vetInfo[];
    private int tl, n;

    public Noh(int n, int info) 
    {
        this.n=n;
        vetLig=new Noh[n];
        vetInfo=new int[n+1];        
        tl=1;        
        for(int i=0; i<n; i++)
        {
            vetInfo[i]=0;
            vetLig[i]=null;
        }   
        vetLig[n]=null;
        vetInfo[0]=info;
    }

    public Noh getLig(int pos) 
    {
        return vetLig[pos];
    }

    public void setLig(int pos, Noh Lig) 
    {
        this.vetLig[pos] = Lig;
    }

    public int getInfo(int pos) 
    {
        return vetInfo[pos];
    }

    public void setInfo(int pos, int Info) 
    {
        this.vetInfo[pos] = Info;
    }

    public int getTl() 
    {
        return tl;
    }

    public void setTl(int tl) 
    {
        this.tl = tl;
    }

    public int getN() 
    {
        return n;
    }   
}
