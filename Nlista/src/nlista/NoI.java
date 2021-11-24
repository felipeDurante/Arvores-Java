
package nlista;

public class NoI 
{
    private NoI prox;    
    private int info;

    public NoI(int info)
    {
        this.info= info;        
        this.prox= null;
    }

    public int getInfo() 
    {
        return info;
    }

    public NoI getProx() 
    {
        return prox;
    }

    public void setInfo(int info) 
    {
        this.info = info;
    }

    public void setProx(NoI prox) 
    {
        this.prox = prox;
    }
}
