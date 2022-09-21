package Main;

import Notas.beans.DispositivosM;
import Notas.beans.EngenhariadeS;
import Notas.beans.Ingles;
import Notas.beans.Metodologia;
import Notas.beans.Poo;
import Notas.beans.SistemasOp;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
          
          int dmP1 = Integer.parseInt(JOptionPane.showInputDialog("Insira a p1 de Despositovos moveis"));
          int dmP2 = Integer.parseInt(JOptionPane.showInputDialog("Insira a p2 de Despositovos moveis"));
          DispositivosM boletinDm = new DispositivosM(dmP1, dmP2);
          
          
          int esP1 = Integer.parseInt(JOptionPane.showInputDialog("Insira a p1 de Engenharia de Software"));
          int esP2 = Integer.parseInt(JOptionPane.showInputDialog("Insira a p2 de Engenharia de Software"));
          EngenhariadeS boletinEs = new EngenhariadeS(esP1, esP2);
          
          int inP1 = Integer.parseInt(JOptionPane.showInputDialog("Insira a p1 de Ingles"));
          int einP2 = Integer.parseInt(JOptionPane.showInputDialog("Insira a p2 de Ingles"));
          Ingles boletinIn = new Ingles(inP1, einP2);
          
          int meP1 = Integer.parseInt(JOptionPane.showInputDialog("Insira a p1 de Engenharia de Software"));
          int meP2 = Integer.parseInt(JOptionPane.showInputDialog("Insira a p2 de Engenharia de Software"));
          Metodologia boletinMe = new Metodologia(meP1, meP2);
          
          int poP1 = Integer.parseInt(JOptionPane.showInputDialog("Insira a p1 de Engenharia de Software"));
          int poP2 = Integer.parseInt(JOptionPane.showInputDialog("Insira a p2 de Engenharia de Software"));
          Poo boletinPo = new Poo(poP1, poP2);
          
          int siP1 = Integer.parseInt(JOptionPane.showInputDialog("Insira a p1 de Engenharia de Software"));
          int siP2 = Integer.parseInt(JOptionPane.showInputDialog("Insira a p2 de Engenharia de Software"));
          SistemasOp boletinSi = new SistemasOp(siP1, siP2);
          
          Integer.parseInt(JOptionPane.showInputDialog("Boletim final\n" + boletinDm + "\n" + boletinEs + "\n" + boletinIn + "\n" + boletinMe + "\n" + boletinPo + "\n" + boletinSi));  
    }
}
