
package nlista;

public class listaI 
{
    private NoI inicio;
    
    public listaI(int info, int n)
    {        
        int i=0;
        NoI aux= inicio;
        aux.setInfo(info);
        while(i<n)
        {
            i++;
            aux.setInfo(0);
            aux=aux.getProx();            
        }
    }
    
    public NoI getInicio() 
    {
        return inicio;
    }

    public void setInicio(NoI inicio) 
    {
        this.inicio = inicio;
    }
    
    public NoI posiciona(int info)
    {
        NoI aux = inicio;       
        while(aux != null && info > aux.getInfo())
            aux = aux.getProx();        
        return aux;
    }
    
    public int pegaPos(int info)
    {
        NoI aux = inicio;     
        int i=0;
        while(aux != null && info > aux.getInfo())
        {
            aux = aux.getProx();        
            i++;
        }
        return i;
    }
}
