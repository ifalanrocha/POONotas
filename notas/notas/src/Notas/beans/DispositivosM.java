package Notas.beans;



public class DispositivosM {
   private int p1, p2, media; 

    public DispositivosM() {
    }

    public DispositivosM(int p1, int p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.media = media = (p1 * 2 + p2 * 3)/5 ;
    }

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }
    
    public String toString() {
        return "DispositivosM P1:" + p1 + " P2:" + p2 + " Media:"+ media;
    } 
}
