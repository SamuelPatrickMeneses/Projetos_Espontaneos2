
package aplicaçõesGraficas.pixelArtBasico;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class Tela extends JPanel implements MouseListener{
    public  int[][] desenho = new int[20][15];
    
    
    @SuppressWarnings("empty-statement")
    public Tela(){
      int[][] temp = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,1,0,1,1,1,0,1,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,0,1,1,1,0,0,0,0,0,1,1,1,0,0,0,0,0,0},
                      {0,0,0,1,0,1,0,0,0,0,0,1,0,1,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
      desenho = temp; 
    }
   @Override
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      int quadrado = 40;
      for(int y = 0; y < 15;y++){
      for(int x = 0; x < 20;x++){
       if(desenho[y][x] == 1){
           g.setColor(Color.YELLOW);
       }else{
           g.setColor(Color.BLUE);
       }   
       g.fillRect(x * quadrado, y * quadrado, quadrado, quadrado);
      }    
      }
      
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    int x = (int) e.getX()/43;
    int y = (int) e.getY()/43;
    System.out.println(x+"  "+y);
    if(desenho[y][x] == 1){
        desenho[y][x] = 0;
    }else{
        desenho[y][x] = 1;
    }
    Launcher.janela.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    
    }

    @Override
    public void mouseEntered(MouseEvent e) {
            }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}
