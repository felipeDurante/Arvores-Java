
package btree;

public class No
{
    int n=2;
    int Info[]= new int[n*2+1];
    int Pos[]= new int[n*2+1];
    No Lig[]= new No[n*2+2];
    int tl;

    public No()
    {
        int i;
        for (i=0;i<n*2;n++)
        {
            Info[i]=0;
            Pos[i]=0;
            Lig[i]=null;
        }
        tl=0;
        Lig[i]=null;
    }

    public int getInfo(int i) {
        return Info[i];
    }

    public No getLig(int i) {
        return Lig[i];
    }

    public int getPos(int i) {
        return Pos[i];
    }

    public int getN() {
        return n;
    }

    public int getTl() {
        return tl;
    }

    public void setInfo(int Info,int pos) {
        this.Info[pos] = Info;
    }

    public void setLig(No Lig,int pos) {
        this.Lig[pos] = Lig;
    }

    public void setPos(int Pos, int i) {
        this.Pos[i] = Pos;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setTl(int tl) {
        this.tl = tl;
    }





}
