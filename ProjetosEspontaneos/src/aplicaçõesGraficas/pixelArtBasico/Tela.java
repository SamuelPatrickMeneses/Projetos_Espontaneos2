
package aplicaçõesGraficas.pixelArtBasico;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class Tela extends JPanel {
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
      
    }} 