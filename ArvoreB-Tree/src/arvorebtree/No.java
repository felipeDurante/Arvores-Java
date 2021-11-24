package arvorebtree;

public class No
{
    private int vetinfo[] = new int[5];
    private int vetpos[]=new int[5];
    private No lig[] = new No[6];
    private int tl;

    public No()
    {
        tl=0;
    }

    public No getLig(int pos) {
        return lig[pos];
    }

    public void setLig(int pos,No ligacao) {
        lig[pos] = ligacao;
    }

    public int getTl() {
        return tl;
    }

    public void setTl(int tl) {
        this.tl = tl;
    }

    public int getVetinfo(int pos) {
        return vetinfo[pos];
    }

    public void setVetinfo(int pos,int info) {
        vetinfo[pos] = info;
    }

    public int getVetpos(int pos) {
        return vetpos[pos];
    }

    public void setVetpos(int pos,int posarq) {
        vetpos[pos] = posarq;
    }
}
