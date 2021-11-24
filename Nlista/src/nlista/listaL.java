
package nlista;

public class listaL 
{
    private NoL inicio;
    
    public listaL(int n)
    {        
        int i=0;
        NoL aux= inicio;
        n+=1;
        while(i<n)
        {
            i++;
            aux.setInfo(null);
            aux=aux.getProx();            
        }
    }
    
    public NoL getInicio() 
    {
        return inicio;
    }

    public void setInicio(NoL inicio) 
    {
        this.inicio = inicio;
    }
    
    public NoL posiciona(int pos)
    {
        NoL aux = inicio;    
        int i=0;
        while(aux != null && i<pos)
        {
            aux = aux.getProx(); 
            i++;
        }
        return aux;
    }
}
