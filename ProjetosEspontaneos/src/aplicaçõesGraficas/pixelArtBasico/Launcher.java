
package aplicaçõesGraficas.pixelArtBasico;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Launcher {
   public static Tela tela = new Tela();
   public static Janela janela = new Janela();
 public static void main(String[] args){
     Launcher.janela.addMouseListener(new MouseAdapter(){
          @Override
    public void mousePressed(MouseEvent e) {
    int x = (int) e.getX()/42;
    int y = (int) e.getY()/43;
    System.out.println(x+"  "+y);
    if(tela.desenho[y][x] == 1){
        tela.desenho[y][x] = 0;
    }else{
        tela.desenho[y][x] = 1;
    }
    Launcher.janela.repaint();
    }
      });
    Launcher.janela.add(tela);
    
 }
}
