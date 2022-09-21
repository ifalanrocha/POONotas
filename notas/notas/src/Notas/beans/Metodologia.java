/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notas.beans;

/**
 *
 * @author vinic
 */
public class Metodologia {
    private int p1, p2, media; 

    public Metodologia(int p1, int p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.media = media = (p1 * 2 + p2 * 3)/5;
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

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }
    public String toString() {
         return "Metodologia P1:" + p1 + " P2:" + p2 + " Media:"+ media;
    }
}
