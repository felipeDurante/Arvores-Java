
package nlista;

public class NoL 
{
      private NoL prox;    
    private Noh info;

    public NoL(Noh info)
    {
        this.info= info;        
        this.prox= null;
    }

    public Noh getInfo() 
    {
        return info;
    }

    public NoL getProx() 
    {
        return prox;
    }

    public void setInfo(Noh info) 
    {
        this.info = info;
    }

    public void setProx(NoL prox) 
    {
        this.prox = prox;
    }
}
