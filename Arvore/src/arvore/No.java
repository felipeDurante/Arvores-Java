

package arvore;

public class No
{
    private No lig1,lig2,lig3;
    private int info1,info2,tl;

    public No (int info)
    {
        info1=info;
        tl=1;
        lig1=lig2=lig3=null;
    }

    public int getInfo1() {
        return info1;
    }

    public int getInfo2() {
        return info2;
    }

    public No getLig1() {
        return lig1;
    }

    public No getLig2() {
        return lig2;
    }

    public No getLig3() {
        return lig3;
    }

    public void setInfo1(int info1) {
        this.info1 = info1;
    }

    public void setInfo2(int info2) {
        this.info2 = info2;
    }

    public void setLig1(No lig1) {
        this.lig1 = lig1;
    }

    public void setLig2(No lig2) {
        this.lig2 = lig2;
    }

    public void setLig3(No lig3) {
        this.lig3 = lig3;
    }

    public void setTl(int tl) {
        this.tl = tl;
    }

    public int getTl() {
        return tl;
    }

}
